define([ 
	"dojo/_base/declare",
	"dojo/_base/lang",
	"dojo/_base/array",
	"dojo/dom-construct",
	"dojo/dom-style",
	"dojo/dom",
	"dojo/html",
	"dojo/on",
	"icm/base/_BaseWidget",
	"icm/base/BasePageWidget",    
	"dijit/_TemplatedMixin",
	"dijit/_WidgetsInTemplateMixin",
	"ecm/model/Desktop",
	"dojo/text!./template/PersonInfo.html"], 
		function(declare, lang, array, domConstruct, domStyle, dom, html, on, _BaseWidget, BasePageWidget,  _TemplatedMixin, _WidgetsInTemplateMixin, Desktop, template){

    return declare("idirectdoc.icm.custom.pgwidget.personinfo.PersonInfo", [ _BaseWidget, BasePageWidget,_TemplatedMixin, _WidgetsInTemplateMixin], {
		templateString : template,
		widgetsInTemplate: true,
		
		/**
		 *
		 */
		postCreate: function(){
			console.debug("postcreate in Person Info",this.widgetProperties);

			if(this.widgetProperties["isloggedonuser"]){	
				this.displayUser(Desktop.userId.toLowerCase(),Desktop.userDisplayName);
			}else{
				/*var caseDisplayProps = this.widgetProperties["propertylist"];
				var table = domConstruct.create("table", {});//domConstruct.create("table", {id: "AdditionalProps"}, "AdditionalProps","replace");
				//array.forEach(caseDisplayProps.split(","), function(oneProp){
				for(i=0;i<caseDisplayProps.split(",").length;i++){
					oneProp = caseDisplayProps.split(",")[i];
					console.debug("oneProp ",oneProp);
					console.debug("table ", table); 
					var tr = domConstruct.create("tr", {}, table);
					var td = domConstruct.create("td", {}, tr);
					var lbl = domConstruct.create("span", {
					 innerHTML: oneProp + ': ',
					 'class': 'personInfoRegular',
					 'for': oneProp
					}, td, 'first');
					var val = domConstruct.create("span", {
					 innerHTML: oneProp ,
					}, td, 'last');
					console.debug("tr ",tr); 
					
				};
				domConstruct.place(table, dom.byId("AdditionalProps"), "last");*/
				
			}
			this.inherited(arguments);
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
			this.displayUser(payload.userId,payload.userName, payload.dob, payload.gender, payload.insurance, payload.caseEditable );
			
			this.logInfo("handleICM_SendPersonInfoEvent", payload.caseEditable);
		},
		
		displayUser(userId, userFullName, dob, gender, insurance, caseEditable){
			console.debug("displayUser in Person Info",userId, userFullName, dob, gender, caseEditable);
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
			
			if(insurance)	this.InsuranceVal.innerHTML = insurance ;
			else domStyle.set(this.Insurance,"display","none");
			
			var caseDisplayProps = this.widgetProperties["propertylist"];
			console.debug("caseDisplayProps ",caseDisplayProps);
			if(caseDisplayProps && caseEditable){
				var locCaseEditable = caseEditable;
				console.debug("locCaseEditable ",locCaseEditable);
				var table = "<table>";
				//array.forEach(caseDisplayProps.split(","), function(oneProp){
				for(i=0;i<caseDisplayProps.split(",").length;i++){
					oneProp = caseDisplayProps.split(",")[i];
					console.debug("oneProp ",oneProp);
					if(locCaseEditable.propertiesCollection[oneProp]){
						var row = "<tr><td style='padding:10px;'> <div><span class='personInfoRegular'>"+locCaseEditable.propertiesCollection[oneProp].name+": </span></td><td><span>"+
							locCaseEditable.propertiesCollection[oneProp].value+"</span></div></td></tr>";
						console.debug("row ",row);
						table+=row;
					}else{
						console.warn("cannot find property ",oneProp);
					}
				};
				table+="</table>"
				this.AdditionalProps.innerHTML = table;
			}
			
		}
	});
});