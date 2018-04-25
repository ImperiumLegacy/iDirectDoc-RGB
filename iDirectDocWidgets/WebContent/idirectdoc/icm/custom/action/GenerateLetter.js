define([
	"dojo/_base/declare",
	"dojo/_base/lang",
	"dojo/_base/array",
    "icm/action/Action",
	"ecm/model/Request",
	], function(declare, lang, array, Action, Request) {

		return declare("osc.icm.custom.action.GenerateLetter", [Action], {

			isEnabled: function()
			{
				return this.inherited(arguments);
			},
			
			isVisible: function()
			{
				return this.inherited(arguments);
			},
			
			execute: function()
			{
				console.debug("Executing Generate Letter");
				var document = this.getActionContext("Document");
				console.debug(document);
				
				var desktop = new ecm.model.Desktop();
				console.debug('Tracker directory',desktop.userDisplayName);
				
				var caseEditable = this.getActionContext("Case");
				var workitemEditable = this.getActionContext("WorkItem");
				if(caseEditable === null || caseEditable.length == 0) {
					if(workitemEditable==null || workitemEditable.length == 0){ //available to Workitem
					  return false;
					}
				}

				this.caseObj=null;
				if(caseEditable!=null){
				   if(caseEditable[0] instanceof icm.model.CaseEditable){
					   this.caseObj = caseEditable[0].getCase();
				   }else{
					   this.caseObj = caseEditable[0];
				   }
				}else{ 
				  this.caseObj = workitemEditable[0].getCase();  //work item
				}
				
				console.debug("caseObj",this.caseObj);
				console.debug("this",this);
				console.debug("widget properties",this.widgetProperties);
				
				var requestParams={};
				requestParams.templatevsid = this.arguments.lettervsid;
				requestParams.multipleallowed = this.arguments.multipleallowed;
				requestParams.lettertitle = this.arguments.lettertitle;
				requestParams.fileinfolder = this.arguments.fileinfolder;
				
				requestParams.caseid = "{"+this.caseObj.id+"}"; 
				requestParams.repositoryId = this.caseObj.repository.repositoryId;
				requestParams.userdisplayname = ecm.model.desktop.userDisplayName;
				requestParams.userid = ecm.model.desktop.userid;
				
				Request.invokePluginService('OSCPlugin','osc.icm.custom.service.LetterGenerator',{
					requestParams: requestParams,
					requestCompleteCallback: lang.hitch(this,function(response){
						console.debug('Success Response in GenerateLetter',response);
						
						var osName = this.caseObj.repository.objectStoreName;
						this.caseObj.repository.retrieveItem(
							response.documentid,
							lang.hitch(this,function(contentitem){
								console.debug("contentitem",contentitem);
								this.broadcastEvent("osc.LetterGenerated",{"contentItem":contentitem,"eventName":"osc.LetterGenerated","eventType":"wired"});
							}),
							"Document",
							null,
							null,
							osName,
							null
						);
						
					}),
					requestFailedCallback:lang.hitch(this,function(ex){
						console.error('Error occured',ex);
						this.broadcastEvent("osc.LetterGenerated",null);
					})
				
				});
				
			},
			
			_eoc_:null

		});
});