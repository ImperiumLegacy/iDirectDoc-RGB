/**
 * Licensed Materials - Property of IBM
 * (C) Copyright IBM Corp. 2010, 2014
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */
define(["dojo/_base/declare",
        "dojo/_base/lang",
        "dojo/_base/array",
        "dojo/dom-class",
        "dojo/dom-geometry",
        "dojo/dom-style",
		"dojo/request",
	    "ecm/widget/dialog/BaseDialog",
		"pvr/widget/editors/DropDownGridEditor",
		"dijit/layout/ContentPane",
		"dijit/layout/BorderContainer",
		"dojo/dom",
		"dojo/dom-construct",
		"dijit/registry",
		"dojo/dom-attr",
		"dojo/keys",
		"dojo/json",
		"dojo/on",
		"dojo/_base/event",	
        "ecm/widget/ValidationSimpleTextarea",
		"ecm/widget/DatePicker",
		"ecm/widget/TimePicker",
		"idx/form/DateTimeTextBox",
		"dojo/parser",		
	    "dojo/text!./templates/AddToDoTaskDialog.html"
	   ],

	function(declare, lang, array, domClass, domGeom, domStyle, Request, BaseDialog,DropDownGridEditor,ContentPane2,BorderContainer,dom,domConstruct,registry,domAttr,keys,JSON,on,event,ValidationSimpleTextarea,DatePicker,TimePicker,DateTimePicker,parser,template){
		/**
		 * @name osc.icm.custom.dialog.AddToDoTaskDialog
		 * @class Represents the Add Task dialog box that case workers use to add a discretionary task.
		 * @augments ecm.widget.dialog.BaseDialog
		 */

		return declare("osc.icm.custom.dialog.AddToDoTaskDialog", [BaseDialog], {
			/** @lends osc.icm.custom.dialog.AddToDoTaskDialog.prototype */

		contentString: template,
		resourceBundle: null,
		fields: [],
		layout:null,		
		centerPane:null,
		inputFields: [],
		choiceProperties: [],
		parentChoiceList:null,
		dependentChoiceList:null,
		jsonPairs:null,
				
//		_loadingImage: dojo.moduleUrl("dojox", "image/resources/images/loading.gif").toString(),

		constructor: function(){
			this.resourceBundle = icm.util.Util.getResourceBundle("caseInfo");
		},

		/**
		 * Called after widget creation to initialize the widget and connect events.
		 *
		 * @private
		 */
		postCreate: function()
		{
			this.inherited(arguments);

			
			this.fields =  [];
			this.layout = null;		
			this.centerPane = null;
			this.inputFields =[];
			this.choiceProperties =[];
			this.parentChoiceList = null;
			this.dependentChoiceList = null;
			this.jsonPairs = null;
			
			
			// Initialize the dialog dijit
			this.setTitle(this.resourceBundle.newTaskDialogTitle);
			this.setResizable(false);
			//this.setSize(600,550);
			this._okButton = this.addButton(this.resourceBundle.okButton, "_onOK", false, false);
//	        this.loadingImageNode.style.display = "none";

	        var items = [{
	                        symbolicName: "",
	                        taskDisplayName: ""
	                    }];
	        //this.taskTypeInput = this._buildFilterSelect(items, false);
						
			console.debug("taskSymbolicName : " + this.taskSymbolicName);
        
	        this._loadTaskTypes(dojo.hitch(this, "_render"));
			this.connect(this, "onShow", function() {
				if(!this.isMaximized())
					domGeom.setMarginBox(this.domNode, {w: 450});
			});
												
		},
		
		isMaxim: function() {
			var maxim = this.isMaximized();
			return maxim;
		},
		
		resize: function() {
			if(!this.isMaxim())
					domGeom.setMarginBox(this.domNode, {w: 450});
			this.inherited(arguments);
			
			//var width = domGeom.getContentBox(this.domNode).w -50;
			var width = domGeom.getContentBox(this.domNode).w -70;
			var layoutWidth = domGeom.getContentBox(this.domNode).w -60;
			var centerPaneWidth = domGeom.getContentBox(this.domNode).w -70;
			var controlWidth = domGeom.getContentBox(this.domNode).w -80;
			console.debug("width::", width);
			console.debug("layoutWidth::", layoutWidth);
			
			
			if(this.taskTypeInput!= undefined) {			
				domStyle.set(this.taskTypeInput.domNode, "width", width+"px");	
				
			
			domStyle.set(this.taskNameInput.domNode, "width", width+"px");
			if(this.layout!=null && this.layout!=undefined){
				domStyle.set(this.layout.domNode, "width", layoutWidth+"px");
				domStyle.set(this.centerPane.domNode, "width", centerPaneWidth+"px");
			}
			
			for(i=0; i<this.fields.length;i++) {
				var propName = this.fields[i].fieldId;
				var dataType = this.fields[i].dataType;
				var choiceFields = null;				
																
				for(j=0; j<this.choiceProperties.length;j++) {
					if(this.choiceProperties[j].symbolicName == propName) {										
						choiceFields = this.choiceProperties[j].ChoiceListField;
						console.debug("choiceFields::", choiceFields);	
						break;
					}
				}
				
				
				if(choiceFields != null) {										
					domStyle.set(choiceFields.domNode, "width", controlWidth+"px");
				} else {
					console.debug("propName::", propName);
					//domStyle.set(dijit.byId(propName), "width", controlWidth+"px");
					console.debug("dataType::", dataType);
					if(dataType == "xs:timestamp") {
						/*if(dijit.byId(propName)) {
							console.debug("dataType::", dataType);
							console.debug("registry.byId(propName)::", dijit.byId(propName));
							//domStyle.set(dijit.byId(propName).domNode, "width", controlWidth+"px");
							 dijit.byId(propName).domNode.style.width = controlWidth+"px";							
							//dijit.byId(propName).style.width = controlWidth+"px";
						}*/
						
					}else {
						if(registry.byId(propName)) {
							console.debug("registry.byId(propName)::", propName);					
							registry.byId(propName).domNode.style.width = controlWidth+"px";
						}
					}
					//domStyle.set(dom.byId(propName), "width", controlWidth+"px");																					
				}
																																								
			}
			
			}
			
			
										
			this._okButton.set("disabled", false);		
		}, 
		
		
		
	    _loadTaskTypes: function(callback) {
//	    	this.loadingImageNode.style.display = "block";
	    	var caseType= this.caseObj.getCaseType();
	    	caseType.retrieveDiscretionaryTaskTypes(callback);
	    },

	    _render: function(taskTypes){
	    	if(this.action.isToDo){
	    		taskTypes = array.filter(taskTypes, function(taskType){
	    			return taskType.isToDo;
	    		});
	    	}else{
	    		taskTypes = array.filter(taskTypes, function(taskType){
	    			return !taskType.isToDo;
	    		});
	    	}
	        this.taskTypes = taskTypes;

	        //destroy current taskTypeInput, create a new one with task types as items
			
				if(this.taskTypeInput){
					this.taskTypeInput.destroy();
				}
			

	        taskTypes.sort(function(a, b) {
	            var aName = a.name;
	            var bName = b.name;
	            return aName.localeCompare(bName);
	        });
	        var items = [];
	        if(taskTypes && taskTypes.length > 0) {
	            var i;
				var defaultTaskName="";
	            for(i = 0; i < taskTypes.length; i++) {
					console.debug("Iterating Tasktype::", taskTypes[i]);
	            	//if(!taskTypes[i].isHidden() && taskTypes[i].instanceCreationRights){//Hide hidden task type				
					//Added condition to show only configured Tasks
					if(!taskTypes[i].isHidden() && taskTypes[i].instanceCreationRights && this.taskSymbolicName == taskTypes[i].id){//Hide hidden task type
					
					taskTypes[i].retrieveAttributeDefinitions(dojo.hitch(this, "_parseTaskTypeAttributes"));
					
						if(defaultTaskName===""){
							defaultTaskName = taskTypes[i].name;
						}
										
						items.push({
							symbolicName: taskTypes[i].id,
							taskDisplayName: taskTypes[i].name,
							taskType: taskTypes[i]
						});
	            	}
	            }
	            this.taskTypeInput = this._buildFilterSelect(items, false);
	            this.taskNameInput.set("value", defaultTaskName);
	        }
	        else {
	            items.push({
	                symbolicName: icm.util.Util.getResourceBundle("common").none,
	                taskDisplayName: icm.util.Util.getResourceBundle("common").none
	            });
	            this.taskTypeInput = this._buildFilterSelect(items, true);
	        }
			console.debug("caseObj is :: ",this.caseObj);
						
			
			
	    },
		
		//Parse Attribute definitions
		_parseTaskTypeAttributes: function(attributeDefinitions) {
			
			 for(j=0; j<this.commaSeparatedtaskProps.length;j++) { 	
				/*for(i = 0; i < attributeDefinitions.length; i++) {
					// Add only properties defined in the Action Arguments to the array
					if(this.commaSeparatedtaskProps[j] == attributeDefinitions[i].id) {
					console.debug("commaSeparatedtaskProps[j] : " + this.commaSeparatedtaskProps[j]);
						this.fields.push({
							name: attributeDefinitions[i].name,
							fieldId: attributeDefinitions[i].id,
							maxLength: attributeDefinitions[i].maxLength,
							required: attributeDefinitions[i].required
						});
						break;
					}
				}*/
				console.debug("commaSeparatedtaskProps[j] : " + this.commaSeparatedtaskProps[j]);
				var attrName = this.commaSeparatedtaskProps[j];
				var matchedAttrs = attributeDefinitions.filter( function (oneAttr) {
					return attrName == oneAttr.id;
				});
				
				console.debug("matchedAttrs",matchedAttrs);
				if(matchedAttrs.length>0){
					this.fields.push({
						name: matchedAttrs[0].name,
						fieldId: matchedAttrs[0].id,
						maxLength: matchedAttrs[0].maxLength,
						required: matchedAttrs[0].required,
						choiceList: matchedAttrs[0].choiceList,
						dataType: matchedAttrs[0].dataType
					});
				}
				
			 }
			 			 
			 for(i=0; i<this.fields.length;i++) {
				console.debug("name : " + this.fields[i].name);
				console.debug("fieldId :" + this.fields[i].fieldId);	
				console.debug("maxLength :" + this.fields[i].maxLength);	
				console.debug("required :" + this.fields[i].required);					
			 }
			 
			 			
			this._buildDynamicHTML();
		 			 			 
		},
		
		
		//Build dynamic HTML with Task Properties
		_buildDynamicHTML: function() {
		
			
			if(registry.byId('centerPane1')) {
				console.debug("Dialog is not empty");
				registry.byId('centerPane1').destroy(true);
			}
			
			if(registry.byId('layout1')) {
				console.debug("Dialog is not empty");
				registry.byId('layout1').destroy(true);
			}
			
			
		
				
		  if(this.layout !=null) {
			console.debug(" Layout is not null");
			this.layout.destroyRecursive(false);
		  }

			this.layout = new BorderContainer({
					id: "layout1",
					design: "headline",
					style: "width: 400px; height: 400px;"
			});
				
			
			
			
			var dynamicHTML = "";
			//dynamicHTML+= "<div id='${id}_container'>";
			
			dynamicHTML+= "<div id='addToDoTaskDialogDiv'>";
			
			var jsonObj = JSON.stringify(this.edsChoiceListPairs);
			this.jsonPairs = JSON.parse("[" + this.edsChoiceListPairs  + "]");
							
						
			for(i=0; i<this.fields.length;i++) {
							
			    var fieldNameWithoutSpace = this.fields[i].name.replace(/\s+/g, '');
				var fieldNameWithoutSpaceLowerCase = fieldNameWithoutSpace.substr(0, 1).toLowerCase() + fieldNameWithoutSpace.substr(1);
				
				this.inputFields.push({
							attachPoint: fieldNameWithoutSpaceLowerCase + 'Input',
							name: fieldNameWithoutSpace							
						});
				
				var symbolicName = 	this.fields[i].fieldId;
				console.debug("symbolicName " + symbolicName);
				console.debug("caseObj:: ", this.caseObj);
				var propertyChoices = null;
				var dependentChoiceList = 'no';
				var edsChoiceList = 'no'
								
				console.debug('jsonObj', jsonObj);
		
		
				//Loop to check EDS dependent ChoiceLists
				for(m=0;m<this.jsonPairs.length;m++) {				
					console.debug("jsonPairs[m].trg" ,this.jsonPairs[m].trg);					
					if(this.jsonPairs[m].trg == symbolicName) {
						console.debug("dependentChoiceList " , symbolicName);
						dependentChoiceList = 'yes';
						break;
					}
				}
				
				//Loop to check EDS Choice List for directly populating Choice List from EDS call
				for(q=0;q<this.jsonPairs.length;q++) {				
					console.debug("jsonPairs[q].src" ,this.jsonPairs[q].src);					
					//if(this.jsonPairs[q].src == symbolicName && this.jsonPairs[q].trg == "" ) {
					if(this.jsonPairs[q].src == symbolicName) {
						console.debug("EDSChoiceList " , symbolicName);
						edsChoiceList = 'yes';
						break;
					}
				}
				
								
				try {
					//propertyChoices = this.caseObj.attributeDefinitions[symbolicName].choiceList.choices;
					propertyChoices = this.fields[i].choiceList.choices;
					edsChoiceList = 'no';
					console.debug("propertyChoices : ",this.fields[i].choiceList);
				}catch(ex) {
					console.debug("Choicelist is empty for : ",symbolicName);
				}
			
				if(this.fields[i].required) {
					dynamicHTML= dynamicHTML + "<div class='paddingDiv' id='div"+ this.fields[i].fieldId + "'><label for='"+fieldNameWithoutSpace+"'>" + this.fields[i].name + "<font color='red'>*</font></label></div>";
				} else {
					dynamicHTML= dynamicHTML + "<div class='paddingDiv' id='div"+ this.fields[i].fieldId + "'><label for='"+fieldNameWithoutSpace+"'>" + this.fields[i].name + "</label></div>";
				}
				
				if(propertyChoices != null || dependentChoiceList == 'yes' || edsChoiceList == 'yes'  ) {
					console.debug("Choice list is not null");
					this.choiceProperties.push({
							symbolicName: this.fields[i].fieldId,
							name: fieldNameWithoutSpace,
							input: this.fields[i].fieldId + 'Select',
							dependentChoiceList: dependentChoiceList,
							edsChoiceList: edsChoiceList, 
							ChoiceListField: null,
							required: this.fields[i].required,
							choiceList: this.fields[i].choiceList
					});
					dynamicHTML= dynamicHTML +  "<div class='"+fieldNameWithoutSpace+"Select' name='"+fieldNameWithoutSpace+"' id='"+this.fields[i].fieldId+"' dojoAttachPoint='"+ this.fields[i].fieldId +"' promptMessage='${resourceBundle.resultPromptMessage}' invalidMessage='${resourceBundle.invalidMessage}' required='" +this.fields[i].required + "'>";
					dynamicHTML= dynamicHTML + "</div>";

				} else if(this.fields[i].dataType == "xs:timestamp"){
					dynamicHTML= dynamicHTML + "<input class='"+ fieldNameWithoutSpace +"Input' name='"+fieldNameWithoutSpace+"' id='"+this.fields[i].fieldId+"' labelWidth=0px showPickerIcon=true dojoType='idx.form.DateTextBox' data-dojo-props='constraints:{fullYear: true}' invalidMessage = 'Invalid Date.' dojoAttachPoint='"+ this.fields[i].fieldId + "' required='"+this.fields[i].required+"' >";
					dynamicHTML= dynamicHTML + "</input>";
				
				}else {
				    					
					console.debug('Field Max Length: ', this.fields[i].maxLength);
					
					if(parseInt(this.fields[i].maxLength) > 64) {
						//<textarea
						dynamicHTML= dynamicHTML + "<div name='"+fieldNameWithoutSpace+"' id='"+this.fields[i].fieldId+"' value=' ' dojoType='ecm.widget.ValidationSimpleTextarea' data-dojo-props=regExp:'.{0,"+this.fields[i].maxLength+"}' invalidMessage = 'This value can contain no more than "+ this.fields[i].maxLength +" characters.' required='"+this.fields[i].required+"' dojoAttachPoint='"+ this.fields[i].fieldId + "' rows='5' style='width:300px'></div>";
												
					} else {												
						dynamicHTML= dynamicHTML + "<input class='"+ fieldNameWithoutSpace +"Input' name='"+fieldNameWithoutSpace+"' id='"+this.fields[i].fieldId+"' dojoType='dijit.form.ValidationTextBox' data-dojo-props='regExp:\"\^.{0,"+this.fields[i].maxLength+"}$\"' invalidMessage = 'This value can contain no more than "+ this.fields[i].maxLength +" characters.' dojoAttachPoint='"+ this.fields[i].fieldId + "' required='"+this.fields[i].required+"' style='width:300px'>";
						dynamicHTML= dynamicHTML + "</input>";
					}
					//promptMessage='Please enter value' invalidMessage='Please enter valid value'
					//maxLength='"+ this.fields[i].maxLength +"'					
				}
								
			}
															
			dynamicHTML+="</div>";
			
			console.debug("dynamicHTML " + dynamicHTML);
			this.centerPane = new ContentPane2({
					id: "centerPane1",
					region: "center",
					content: dynamicHTML                        
			});
						
			//dojo.place(dynamicHTML, this.centerPane.containerNode);			
			
			
			
			this.layout.addChild(this.centerPane);				
			this.layout.placeAt(this.contentArea);
			this.layout.startup();
			//this.setSize(600,650);
			//Set dialog height to 70% of the window
			this.setSize(600,window.innerHeight * 0.7);
			//(window.innerHeight * 0.7)
			
			
			
			this._buildDynamicChoiceListFields();
			
			this._buildDependentChoiceLists();

		
		
		},
		
		// Build Dynamic Choice List
		_buildDynamicChoiceListFields: function() {
		
			for(i=0; i<this.choiceProperties.length;i++) {
				 				 
				 var choices = null;
				 
				 if (this.choiceProperties[i].dependentChoiceList == 'yes' || this.choiceProperties[i].edsChoiceList == 'yes' ) {
					choices = [];
				 } else {
					//choices = this.caseObj.attributeDefinitions[this.choiceProperties[i].symbolicName].choiceList.choices;
					choices = this.choiceProperties[i].choiceList.choices;
				 }
				 
								 
				 if(registry.byId(this.choiceProperties[i].input)) {
					registry.byId(this.choiceProperties[i].input).destroy();
				 }
				 
				 
				 this.choiceProperties[i].ChoiceListField = this._buildChoicelistFilterSelect(this.choiceProperties[i].input,dom.byId(this.choiceProperties[i].symbolicName), choices, false,'NotSelected',this.choiceProperties[i].required);
				 console.debug("Building Choice List fields. id ", this.choiceProperties[i].input);
				 
				 //If ChoiceList Values are coming from EDS, Populate the choicelist from EDS call
				 if(this.choiceProperties[i].edsChoiceList == 'yes' ) {
				 
						var edsIndependentChoiceListField = this.choiceProperties[i].ChoiceListField;
						
						var reqPayload = {};
						reqPayload.requestMode = "initialNewObject";
						reqPayload.properties = [];
																											
						var edsChoiceListObject = {};
						edsChoiceListObject.symbolicName = this.choiceProperties[i].symbolicName; 											
						edsChoiceListObject.value="";
						var symbolicName = 	this.choiceProperties[i].symbolicName; 																																								
						reqPayload.properties.push(edsChoiceListObject);
						 
						Request.post(
							//"/EDSService/type/OSCCM_SecuritiesIssue",
							//EDS not working for OSCCM_AccountingIssue. Uncomment below line when EDS is functional
							"/EDSService/type/"+ this.taskSymbolicName,
							{
								data: dojo.toJson(reqPayload),
								headers:{
									"Content-Type" : "application/json" 
								},
								handleAs: "json" , preventCache: true
							}
						).then(
							lang.hitch(this,function(resp){
								console.debug('Response is ', resp);
								for(j=0; j<resp.properties.length;j++) {
									if(symbolicName==resp.properties[j].symbolicName){
										console.debug('Found property',resp.properties[j].symbolicName);
										var choices = resp.properties[j].choiceList.choices;
										console.debug('choices is ', choices);
										//this._refreshFilterSelect(this.outcomeInput,choices);
										this._refreshFilterSelect(edsIndependentChoiceListField,choices);
										break;
									}
								}
							})
							
						);				 
				 }
			}
		
		},
		
		
		//Build dependent EDS Choice List  
		_buildDependentChoiceLists: function() {
		
			for(n=0;n<this.jsonPairs.length;n++) {	
			    var choiceList1 = null;
				var dependentChoiceList1 = null;
				console.debug('jsonPairs',this.jsonPairs[n].src);	
			
				if(this.jsonPairs[n].trg != '') {
				
					for(d=0; d<this.choiceProperties.length;d++) {
						if(this.choiceProperties[d].symbolicName == this.jsonPairs[n].src) {
							choiceList1 = this.choiceProperties[d].ChoiceListField;
							console.debug('choiceList1',choiceList1);	
							break;
						}				 
					}
								
					for(e=0; e<this.choiceProperties.length;e++) {
						if(this.choiceProperties[e].symbolicName == this.jsonPairs[n].trg) {
							dependentChoiceList1 = this.choiceProperties[e].ChoiceListField;
							console.debug('dependentChoiceList1',dependentChoiceList1);	
							break;
						}				 
					}
					//var inputFieldName  = this.jsonPairs[n].src.split('_')[1] + 'Input';
					//var dependentChoiceListName = this.jsonPairs[n].trg.split('_')[1] + 'Input';
					var choiceListSymbolicName = this.jsonPairs[n].src;
					var dependentChoiceListSymbolicName = this.jsonPairs[n].trg;
					
					var inputFieldName  = choiceListSymbolicName +  'Select'; //this.jsonPairs[n].src.split('_')[1] + 'Input';
					var dependentChoiceListName = dependentChoiceListSymbolicName + 'Select';
					
					
					var dependentPropertyName = this.jsonPairs[n].trg;
					
					console.debug('inputFieldName',inputFieldName);	
					console.debug('dependentChoiceListName',dependentChoiceListName);	
					console.debug("OutComeTypesInput", dom.byId(inputFieldName));					
	
					dojo.connect(choiceList1, 'onChange',lang.hitch(this,function(selectedVal){
						
						//console.debug('outcometype changed',e);
						
						console.debug('onChange called',e);
						console.debug('dom.byId(inputFieldName)', dom.byId(inputFieldName));
						console.debug('inputFieldName', inputFieldName);
						console.debug('dependentChoiceListName',dependentChoiceListName);
						console.debug('choiceList1',choiceList1);
						console.debug('this.taskSymbolicName',this.taskSymbolicName);
					
						//var outcomeTypeVal = choiceList1.value;
						
						console.debug('selectedVal', selectedVal);
					
						var reqPayload = {};
						reqPayload.requestMode = "initialNewObject";
						reqPayload.properties = [];
					
																						
						var outcomeType = {};
						outcomeType.symbolicName = choiceListSymbolicName; 
						//outcomeType.symbolicName = "OSCCM_OutcomeType";						
						outcomeType.value =selectedVal;
					
						var outcome = {};
						outcome.symbolicName = dependentChoiceListSymbolicName;
						outcome.value ="";
						
																				
						reqPayload.properties.push(outcomeType);
						reqPayload.properties.push(outcome);
						
						console.debug('reqPayload is',reqPayload);
						var url = window.location.href;
						var arr = url.split('/');
						Request.post(
							//"/EDSService/type/OSCCM_SecuritiesIssue",
							//EDS not working for OSCCM_AccountingIssue. Uncomment below line when EDS is functional
							"/EDSService/type/"+ this.taskSymbolicName,
							{
								data: dojo.toJson(reqPayload),
								headers:{
									"Content-Type" : "application/json"
								},
								handleAs: "json"
							}
						).then(
							lang.hitch(this,function(resp){
							console.debug('Response is ', resp);
							for(i=0; i<resp.properties.length;i++) {
								if(resp.properties[i].symbolicName == dependentPropertyName ){
								 var choices = resp.properties[i].choiceList.choices;
								 console.debug('choices is ', choices);
								 //this._refreshFilterSelect(this.outcomeInput,choices);
								 console.debug("dependentChoiceListName",dependentChoiceListName);
								 var depChoicelist = dijit.byId(dependentChoiceListName);
								 console.debug("depChoicelist",depChoicelist);
								 this._refreshFilterSelect(depChoicelist,choices);
								 break;
								}
							}
							
							
							})
						);
					
					}));
			
				}
			}
		},

	    _refreshFilterSelect: function(selObj, items) {
			console.debug('items',items);
	        var newStore = new dojo.data.ItemFileWriteStore({
	                data: {
	                    identifier: "value",
	                    label: "displayName",
	                    items: items
	                }
	            });
			
			selObj.set('value',"");	
			selObj.set('store',newStore);
		},
		
		
	    _buildFilterSelect: function(items, disabled) {
	        var store = new dojo.data.ItemFileWriteStore({
	                data: {
	                    identifier: "symbolicName",
	                    label: "taskDisplayName",
	                    items: items
	                }
	            });
	        var id = (new Date()).getTime();
	        var args = {
	            id: id,
	            name: "taskTypeSelect",
	            required: false,
	            store: store,
	            searchAttr: "taskDisplayName",
	            disabled: disabled,
	            onChange: dojo.hitch(this, function(id){
	            	this.taskNameInput.setDisplayedValue(this.taskTypeInput.getDisplayedValue());
	            	var nameValid = this.taskNameInput.isValid();//Check task type is valid
	            	var typeValid = this.taskTypeInput.isValid();//Check task name is valid
	            	var typeName = this.taskTypeInput.get("value");
	            	var okButton = this._okButton;
					
					console.debug("Regenerating issue dropdown for ",typeName);
	            	//this.issueInput.destroy();
					if(typeName=="OSCCM_AccountingIssue")
						this._refreshFilterSelect(this.issueInput,this.caseObj.attributeDefinitions["OSCCM_AccountingIssues"].choiceList.choices);
					else
						this._refreshFilterSelect(this.issueInput,this.caseObj.attributeDefinitions["OSCCM_SecuritesIssues"].choiceList.choices);
					
					//If there is invalid value, disable the ok button
	                if(!nameValid || !typeValid || typeName == icm.util.Util.getResourceBundle("common").none) {
	                    okButton.set("disabled", true);
	                }
	                else {
	                    okButton.set("disabled", false);
	                }
	            })
	        };
	        if(disabled) {
	            args.value = icm.util.Util.getResourceBundle("common").none;
	        }
	        else if(items && items.length > 0) {
	            args.value = items[0].symbolicName;
	        }
	        var taskTypeInput = new dijit.form.FilteringSelect(args);
	        domClass.add(taskTypeInput.domNode, "taskTypesInput");
	        taskTypeInput.placeAt(this.taskTypesNode);
	        taskTypeInput.startup();
	        return taskTypeInput;
	    },

		 //Build ChoiceList field
		//_buildChoicelistFilterSelect: function(ctrlName,ctrlNode, items, disabled, defaultVal) {
		_buildChoicelistFilterSelect: function(ctrlName,ctrlNode, items, disabled, defaultVal,isRequired) {
	        var store = new dojo.data.ItemFileWriteStore({
				data: {
					identifier: "value",
					label: "displayName",
					items: items
				}
			});
	        var id = (new Date()).getTime();
			var controlWidth = domGeom.getContentBox(this.domNode).w -80;
	        var args = {
	            //id: id,
				id: ctrlName,								
	            name: ctrlName,
	            //required: false,
				required: isRequired,
	            store: store,
	            searchAttr: "displayName",
	            disabled: disabled,
				style:'width:'+controlWidth+'px'
	        };
	        
	        var selectInput = new dijit.form.FilteringSelect(args);
	        //domClass.add(taskTypeInput.domNode, "taskTypesInput");
	        selectInput.placeAt(ctrlNode);
	        selectInput.startup();
			
			if(defaultVal!=undefined){
				console.debug('setting default val');
				selectInput.set('value',defaultVal);
			}
			
	        return selectInput;
	    },
		
		
				
	    _onOK: function() {
			    this._okButton.set("disabled", true);//Disable to Ok button to prevent duplicated submit
				var data =this.get('value');

		        var callback = null;
				
				if(this._validateRequiredFields() == false) {
					this._okButton.set("disabled", false);
					alert("Please complete required fields and enter valid data.");
					return;
				}
				
				
		        //selected task type
		        var taskType = this.taskTypeInput.item.taskType[0];

		        if(taskType.launchInfoRequired){//Normal task need AddTask page open
		        /**
		         * mark as private to avoid show up in jsdoc.
		         * @private
		         */
		         callback=function(taskEditable){
		        	taskEditable.setTaskName(data.taskName);
			        var addTaskPagePayload = {
		                    "taskEditable": taskEditable,
							"coordination": new icm.util.Coordination()
		        };
			        this.action.broadcastEvent("icm.AddTask", addTaskPagePayload);
			        this.hide();
		        };
		        }else{  //Silent task. Create task directly without open AddTask page
			        /**
			         * mark as private to avoid show up in jsdoc.
			         * @private
			         */
			         callback=function(taskEditable){
				        	taskEditable.setTaskName(data.taskName);
							
							
							
							for(i=0; i<this.fields.length;i++) {
								var propName = this.fields[i].fieldId;
								var dataType = this.fields[i].dataType;
								var choiceValue = null;
								var fieldValue = null;
								var timeValue = null;
								var fieldDisplayValue = null;
								
								for(j=0; j<this.choiceProperties.length;j++) {
									if(this.choiceProperties[j].symbolicName == propName) {										
										choiceValue = this.choiceProperties[j].input;
										break;
									}
								}
																
								console.debug("PropName::", propName);
								console.debug("DomNode::", dom.byId(propName));
								console.debug("choiceValue::", choiceValue);
								console.debug("dataType::", dataType);
								
								if(choiceValue != null) {
									fieldValue = dijit.byId(choiceValue).get('value');//dom.byId(choiceValue).value;
									fieldDisplayValue = dijit.byId(choiceValue).get('displayedValue');//dom.byId(choiceValue).value;
								} else {									
									fieldValue = dom.byId(propName).value;																		
								}
								
								if(dataType == "xs:timestamp") {
									//timeValue = dom.byId("ts"+propName).value;
									//fieldValue = dom.byId(propName).value;

									fieldValue = (dijit.byId(propName)).get('value');										
																		
									//console.debug("timeValue::", timeValue);
									console.debug("fieldValue::", fieldValue);										
									if(fieldValue !=null) { 
										var dateField = new Date(fieldValue);
										//dateField.setHours(dateField.getHours());
										//var fieldValue1	= dateField.toISOString();
										//var newDate	= new Date(fieldValue1);
										taskEditable.propertiesCollection[propName].setValue(dateField);
									}											
								} else {
								
								
									console.debug("fieldValue::", fieldValue);								
								
									if(fieldValue !=null && fieldValue.trim() != "") {
										taskEditable.propertiesCollection[propName].setValue(fieldValue);
									}
									
									//Check if there is a field symbolicname without _Code and copy the display name in there
									console.debug('lastindex of code',propName.lastIndexOf('_Code'));

									if(choiceValue && (propName.lastIndexOf('_Code')==(propName.length-5))){
										var descField = propName.substring(0,propName.lastIndexOf('_Code'));
										console.debug('descField:'+descField);
										console.debug('fieldDisplayValue:'+fieldDisplayValue);
										console.debug('(taskEditable.propertiesCollection['+descField+']',taskEditable.propertiesCollection[descField]);
										if(taskEditable.propertiesCollection[descField])
											taskEditable.propertiesCollection[descField].setValue(fieldDisplayValue);
									}
								}								
							}
							
														
					        taskEditable.save(lang.hitch(this, function(response, fieldErrors) {
					        	if(this.action.isToDo){
					        		this.action.broadcastEvent("icm.ToDoTaskAdded",{'ToDoTaskEditable':taskEditable});
					        	}else{
									this.action.broadcastEvent("icm.RefreshTab",{"tabId":"Tasks"});
									this.action.broadcastEvent("icm.TaskCreated",{'taskEditable':taskEditable});
					        	}
							}));
					        this.hide();
				        };
		        }

		        if(this.caseObj){
					this.caseObj.createNewTaskEditable(taskType, dojo.hitch(this,callback));
		        }

		},
		
		_validateRequiredFields: function(){
		
			var isValid = true;
					
			if(this.validate()){
				//return confirm('Form is valid, press OK to submit');
				return true;
			}else{
				//alert('Form contains invalid data.  Please correct first');
				return false;
			}
									
			
		},
		
		
		destroyRecursive: function(){
			this.inherited(arguments);
			console.debug("****destroyRecursive******");			
			//dom.byId('OSCCM_Issue').destroy(false);
			//this.OSCCM_Issue.destroyRecursive(false);			
			dojo.forEach(this.getDescendants(), function(widget){
				console.debug("****destroyRecursive******");								
				widget.destroyRecursive();
			});
			//this.inherited(arguments);
		},
		
		
		
	
		_eoc_: null

	});
});
