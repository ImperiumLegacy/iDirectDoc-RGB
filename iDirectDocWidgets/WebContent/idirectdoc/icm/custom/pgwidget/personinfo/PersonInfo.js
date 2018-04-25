define([ 
	"dojo/_base/declare",
	"dojo/_base/lang",
	"dojo/dom-style",
	"dojo/on",
	"icm/base/_BaseWidget",
	"icm/base/BasePageWidget",    
	"dijit/_TemplatedMixin",
	"dijit/_WidgetsInTemplateMixin",
	"ecm/model/Desktop",
	"dojo/text!./template/PersonInfo.html"], 
		function(declare, lang, domStyle, on, _BaseWidget, BasePageWidget,  _TemplatedMixin, _WidgetsInTemplateMixin, Desktop, template){

    return declare("idirectdoc.icm.custom.pgwidget.personinfo.PersonInfo", [ _BaseWidget, BasePageWidget,_TemplatedMixin, _WidgetsInTemplateMixin], {
		templateString : template,
		widgetsInTemplate: true,
		
		/**
		 *
		 */
		postCreate: function(){
			this.inherited(arguments);
			console.debug("postcreate in Person Info",this.widgetProperties);

			if(this.widgetProperties["isloggedonuser"]){	
				this.displayUser(Desktop.userId.toLowerCase(),Desktop.userDisplayName);
			}
		},
		
		startup: function(){
			this.inherited(arguments);	
			
		},


		/**
		 * Handler for icm.Custom event.
		 *
		 * @param payload
		 *        	paylod of the event
		 */
		handleICM_SendPersonInfoEvent: function(payload){
			console.debug("handleICM_SendPersonInfoEvent in Person Info",payload);
			if(!payload){
				return;
			}
			this.displayUser(payload.userId,payload.userName, payload.dob, payload.gender );
			
			this.logInfo("handleICM_SendPersonInfoEvent", payload);
		},
		
		displayUser(userId, userFullName, dob, gender){
			var userImageUrl = this.widgetProperties["userimageretrieveurl"];
			userImageUrl = userImageUrl.replace("{USERID}",userId.toLowerCase());
			this.UserImage.src = userImageUrl;
			this.UserName.innerHTML = userFullName ;
		
			if(dob)	this.DobVal.innerHTML = dob ;
			else domStyle.set(this.Dob,"display","none");
			
			if(gender)	this.GenderVal.innerHTML = gender ;
			else domStyle.set(this.Gender,"display","none");
			
			if(userId)	this.IdentifierVal.innerHTML = userId ;
			else domStyle.set(this.Identifier,"display","none");
		}
	});
});