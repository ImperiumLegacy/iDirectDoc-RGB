define([
	"dojo/_base/declare",
	"dojo/_base/lang",
	"dojo/_base/array",
	"ecm/widget/dialog/BaseDialog",
	"icm/action/Action",
	"ecm/model/Request",
	], function(declare, lang, array, BaseDialog, Action, Request) {

		return declare("idirectdoc.icm.custom.action.ExternalSystemDialog",  [Action], {
			
			init: function(){
				console.debug("Entering init");	
				Request.invokePluginService("iDirectDocPlugin", "ConfigurationService",
					{
						requestParams: {
							configAction: "load"
						},
						
						requestCompleteCallback: lang.hitch(this, function(response) {	// success
							console.debug("response=",response);
							if (response.data) {
								this.pluginconfig = response.data;
							}
						})
					}
				);
			},
			
			isEnabled: function()
			{
				return true;
			},
			
			isVisible: function()
			{
				console.debug("isVisible External System Action");
				var actionArguments = this.getArguments();
				var roles = actionArguments.roles;
				console.debug("isVisible External System Action roles",roles);
				if(roles && roles.trim()!=''){
					var allowedRoles = roles.split(",");
					console.debug("allowedRoles",allowedRoles);
					var currentRole = ecm.model.desktop.currentRole.name;
					console.debug("currentRole",currentRole);
					
					for(var i=0;i<allowedRoles.length;i++){
						if(allowedRoles[i]==currentRole)
							return true;
					}
					//If we got till here then return false
					return false;
				}
				
				return true;
			},
			
			execute: function()
			{
				console.debug("Executing External System Action!");
				
				console.debug("this : " , this);
				console.debug("this.getArguments : ", this.getArguments());
				console.debug("ecm.model.desktop : ",ecm.model.desktop);
			
				var actionArguments = this.getArguments();
				var iFrameURL = this.pluginconfig[actionArguments.url];
				this.websiteDialog = new BaseDialog(
					{
						contentString: "<iframe style='width:100%;height:100%;display:block;border:none;' src='"+iFrameURL+"' />",
						style: "height:80%;width: 80%"
					}
				);
				this.websiteDialog.show();
	   		
			},
						
			_eoc_:null

		});
});