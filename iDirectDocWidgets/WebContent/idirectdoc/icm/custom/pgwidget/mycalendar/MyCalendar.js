define([ 
	"dojo/_base/declare",
	"dojo/_base/lang",
	"dojo/_base/array",
	"dojo/dom-construct",
	"dojo/dom-style",
	"dojo/dom",
	"dojo/html",
	"dojo/on",
	"dojo/ready", 
	"dojo/_base/Deferred",
	"dojox/calendar/Calendar",
	"dojo/store/Memory",
	"dojo/store/Observable",
	"dojo/date/stamp",
	"icm/base/_BaseWidget",
	"icm/base/BasePageWidget",    
	"dijit/_TemplatedMixin",
	"dijit/_WidgetsInTemplateMixin",
	"ecm/model/Desktop",
	"ecm/model/SearchQuery",
	"icm/model/Case",
	"icm/model/CaseEditable",
	"icm/base/Constants", 
	"icm/model/properties/controller/ControllerManager",
	"dojo/text!./template/MyCalendar.html"], 
		function(declare, lang, array, domConstruct, domStyle, dom, html, on, 
				ready, Deferred, Calendar, Memory, Observable, stamp,
				_BaseWidget, BasePageWidget,  _TemplatedMixin, _WidgetsInTemplateMixin, 
				Desktop,SearchQuery, Case, CaseEditable, Constants, ControllerManager, 
				template){

    return declare("idirectdoc.icm.custom.pgwidget.mycalendar.MyCalendar", [ _BaseWidget, BasePageWidget,_TemplatedMixin, _WidgetsInTemplateMixin], {
		templateString : template,
		widgetsInTemplate: true,
		appointments:[],
		
		/**
		 *
		 */
		postCreate: function(){
			console.debug("postcreate in My Calendar",this.widgetProperties,this);

			if(this.widgetProperties["sqlstring"]){	
				this.createAndPopulateCalendar();
			}else{
				
			}
			this.inherited(arguments);
		},
		
		startup: function(){
			this.inherited(arguments);	
			
		},


		/**
		 * Handler for icm.SendCaseInfo event.
		 *
		 * @param payload
		 *        	paylod of the event
		 */
		handleICM_SendCaseInfoEvent: function(payload){
			console.debug("handleICM_SendCaseInfoEvent in "+this.dojoAttachPoint,payload);
			
			if(!payload){
				return;
			}
			this.caseEditable = payload.caseEditable;
			
			this.logInfo("handleICM_SendPersonInfoEvent"+this.dojoAttachPoint, payload.caseEditable);
		},

		/**
		 * Handler for icm.PageActivated event. Events are refreshed each time this is hit
		 *
		 * @param payload
		 *        	paylod of the event
		 */
		handleICM_PageActivatedEvent: function(){
			console.debug("handleICM_PageActivatedEvent in "+this.dojoAttachPoint,payload);
			this.renderEvents(Desktop.userId.toLowerCase(),Desktop.userDisplayName);	
		},
		
		renderEvents: function(userId){
			console.debug("renderEvents in ");
			if(!this.calendar)
				this.createAndPopulateCalendar();
			this.refreshDataStore(userId)
		},
		
		
		createAndPopulateCalendar: function(){
			console.debug("createAndPopulateCalendar in My Calendar");
			
			var someData = [
				{
					id: 0,
					summary: "New Appointment",
					begin: "2018-07-01T10:00",
					end: "2018-07-01T11:00"
				}
			];
			this.calendar = new Calendar({
				dateInterval: "day",
				startTimeAttr: "begin",
				endTimeAttr: "end",
				columnViewProps:{minHours:6},
				style: "position:relative;width:100%;height:600px",
				cssClassFunc: function(item){
					console.debug("css class function",item);
					return item.calendar;
				},
				decodeDate: function(s){
					console.debug("decodeDate in My Calendar",s);		
					var dispDate = stamp.fromISOString(s)
					console.debug("displaydate in My calendar",dispDate);
					return dispDate;
				},
				encodeDate: function(d){
					console.debug("encodeDate in My Calendar",d);		
					var storDate = stamp.fromISOString(d)
					console.debug("stordate in My calendar",storDate);
					return storDate;
				}
			}, document.createElement('div'));
			
			var eventStore = new Observable(new Memory({data: someData}));
			
			Deferred.when(this.calendar.set("store", eventStore), 
				lang.hitch(this,function onOk() {
					console.debug("item added",arguments);
				}), 
				lang.hitch(this,function onFail() {
					console.debug("item add failed",arguments);
				})
			);
			
			var createItem = lang.hitch(this, function(view, d, e, subColumn){

				// create item by maintaining control key
				if(!e.ctrlKey || e.shiftKey || e.altKey){
					return;
				}

				var start, end;
				var colView = this.calendar.columnView;
				var cal = this.calendar.dateModule;

				if(view == colView){
					start = this.calendar.floorDate(d, "minute", colView.timeSlotDuration);
					end = cal.add(start, "minute", colView.timeSlotDuration);
				}else{
					start = this.calendar.floorToDay(d);
					end = cal.add(start, "day", 1);
				}

				var item = {
					summary: "New Appointment ",
					begin: start,
					end: end,
					calendar: "Calendar1",
					allDay: view.viewKind == "matrix"
				};

				//id++;

				return item;
			});

			this.calendar.set("createOnGridClick", true);
			this.calendar.set("editable", true);
			this.calendar.set("createItemFunc", createItem);

			this.calendar.set("onItemDoubleClick", lang.hitch(this,function(e){
				console.debug("double click",e);
				this.openCaseForEdit(e.item.contentItem);
			}));
			this.calendar.set("onItemEditEnd", lang.hitch(this, function(e){
				console.debug("Item Edit end",e);
				if(e.storeItem.contentItem){
					//Existing reschedule
					this.openCaseForEdit(e.storeItem.contentItem, e.item.startTime,e.item.endTime);
				}else{
					//New appointment
					this.openNewCaseEdit( e.item.startTime,e.item.endTime);
				}
			}));
			
			this.viewCalendarNode.appendChild(this.calendar.domNode);

		},
		
		refreshDataStore: function(userId){
			var repo = this.solution.targetObjectStore;
			var solnPrefix = this.solution.getPrefix();
			var className = solnPrefix+"_Event";
			var additionalProps = "["+solnPrefix+"_StartTime],["+solnPrefix+"_EndTime],["+solnPrefix+"_EventSummary],["+solnPrefix+"_Doctor]";
			var colsToRet = ["Id", solnPrefix + "_StartTime",solnPrefix + "_EndTime",solnPrefix + "_EventSummary"];
			var sqlBase = "SELECT  [Id] , " +
				"[ClassDescription], [DateLastModified], [FolderName], " + additionalProps +
				" FROM ["+className+"] ";

			/*Define optional where clause, to specify Working / Complete / etc.*/
			var sqlWhere="";
			
			//There is a doctor case, so show only this doctor
			if(this.caseEditable)
				sqlWhere = " WHERE ["+solnPrefix+"_Doctor]='"+userId+"'";
			var ceQuery = sqlBase + sqlWhere;
			console.info("ceQuery",ceQuery);
			var searchQuery = new SearchQuery({repository: repo,
				   pageSize:0,
				   query:ceQuery,
				   resultsDisplay: {columns: colsToRet},
				   retrieveAllVersions:false,
				   retrieveLatestVersion:true});

			var caseCount = 0;

			searchQuery.search(lang.hitch(this, function(resultSet){
				try {
					console.debug("Search returned ",resultSet);
					caseCount = resultSet.totalCount;
					console.debug("Working Case Count = " + caseCount);
					this.appointments.length=0;
					if(caseCount>0){
						var i=1;

						array.forEach(resultSet.items, lang.hitch(this,function(oneItem){
							console.debug("oneItem",oneItem);

							var oneAppt = {
								id:oneItem.attributes["Id"],
								calendar: oneItem.attributes[solnPrefix+"_Doctor"],
								summary:oneItem.attributes[solnPrefix+"_EventSummary"],
								guid:oneItem.attributes["Id"],
								begin:oneItem.attributes[solnPrefix+"_StartTime"],
								end:oneItem.attributes[solnPrefix+"_EndTime"],
								contentItem: oneItem
							};
							//this.calendar.get("store").add(oneAppt);
							this.appointments.push(oneAppt);
						}));
						
						console.debug("Appointments",this.appointments);
					}else{
						console.warn("No appointment cases found  ");
					}

					var eventStore = new Observable(new Memory({data: this.appointments}));
					this.calendar.set("store", eventStore);

				}catch (Error) {
					console.error (Error.toString());
				}
			}));
		},
		
		openCaseForEdit: function(contentItem,startTime,endTime){
			console.debug("openCaseForEdit "+this.dojoAttachPoint,contentItem,startTime,endTime);
			var _self=this;
			var prefix = this.solution.prefix;
			Case.fromContentItem(contentItem, 
				lang.hitch(this, 
					function(caseObj){
						console.debug("caseObj",caseObj);
						caseEdit = CaseEditable.fromCaseObject(caseObj);
						caseEdit.retrieveAttributes(
							function(fullCaseEdit){
								var coord = new icm.util.Coordination();
								
								if(startTime && endTime){
									//fullCaseEdit.propertiesCollection[prefix+"_StartTime"].value=startTime;
									//fullCaseEdit.propertiesCollection[prefix+"_EndTime"].value=endTime;
									//fullCaseEdit.save(function(resp){console.debug("Case Saved",resp)},function(err){console.error("Error",err);});
									
									/* for the editable and to update the properties. */
									coord.participate(Constants.CoordTopic.LOADWIDGET, function(context, complete, abort) {
										console.debug("Widget load to edit props",context);
									  /* Obtain the controller binding for the editable. */
									  var collectionController = ControllerManager.bind(fullCaseEdit);

									  /* Start a batch of changes. */
									  collectionController.beginChangeSet();

									  /* Make the updates to the properties. */
									  collectionController.getPropertyController("IDC_StartTime").set("value", startTime);
									  collectionController.getPropertyController("IDC_EndTime").set("value", endTime);

									  /* Complete a batch of changes. This tells all subscribed widgets to refresh. */
									  collectionController.endChangeSet();

									  /* Call the coordination completion method. */
									  complete();
									});

									/* Use the AFTERLOADWIDGET coordination topic handler to release the controller binding for the editable. */
									coord.participate(Constants.CoordTopic.AFTERLOADWIDGET, function(context, complete, abort) {
									  /* Release the controller binding for the editable. */
									  ControllerManager.unbind(fullCaseEdit);

									  /* Call the coordination completion method. */
									  complete();
									});
									
								}
									
								var caseDetPayload = {"coordination": coord, "caseEditable":fullCaseEdit};
								console.debug("case details payload",caseDetPayload);
								_self.onBroadcastEvent("icm.OpenCase", caseDetPayload);
							
							}
						);
					}
				)
			);		
			/*this.solution.retrieveCase(
				function(caseObj){
					console.debug("Got case object "+this.dojoAttachPoint,caseObj);
				},
				guid+"",
				function(error){
					console.error("Error opening case");
				},
				false
			);*/
		},
		
		openNewCaseEdit: function(startTime,endTime){
			console.debug("openNewCaseEdit "+this.dojoAttachPoint,startTime,endTime);
			var _self=this;
			console.debug(this.solution.caseTypes);
			var caseType= array.filter(this.solution.caseTypes,function(oneCaseType){
				return oneCaseType.id=="IDC_Event";
			});
			var newCaseEdit = this.solution.createNewCaseEditable("IDC_Event", 
				function(newCase){
					console.debug("New Case Editable",newCase);
					var coord = new icm.util.Coordination();
				   /* for the editable and to update the properties. */
					coord.participate(Constants.CoordTopic.LOADWIDGET, function(context, complete, abort) {
					  /* Obtain the controller binding for the editable. */
					  var collectionController = ControllerManager.bind(newCase);

					  /* Start a batch of changes. */
					  collectionController.beginChangeSet();

					  /* Make the updates to the properties. */
					  collectionController.getPropertyController("IDC_StartTime").set("value", startTime);
					  collectionController.getPropertyController("IDC_EndTime").set("value", endTime);

					  /* Complete a batch of changes. This tells all subscribed widgets to refresh. */
					  collectionController.endChangeSet();

					  /* Call the coordination completion method. */
					  complete();
					});

					/* Use the AFTERLOADWIDGET coordination topic handler to release the controller binding for the editable. */
					coord.participate(Constants.CoordTopic.AFTERLOADWIDGET, function(context, complete, abort) {
					  /* Release the controller binding for the editable. */
					  ControllerManager.unbind(newCase);

					  /* Call the coordination completion method. */
					  complete();
					});
					
					var caseDetPayload = {"caseType":caseType[0],"coordination": coord, "caseEditable":newCase};
					console.debug("case details payload",caseDetPayload);
					_self.onBroadcastEvent("icm.AddCase", caseDetPayload);
				}, 
				function(err){
					console.error(err);
				}, false) ;
			
			
					
		},
		
		
		getPatients: function(context, complete, abort){
			var className = solnPrefix + "_Episode";
			var additionalProps = "["+solnPrefix + "_FullName],["+solnPrefix + "_ClientIdentifier],["+solnPrefix + "_FirstName],["+solnPrefix + "_LastName]";
			var colsToRet = ["Id", solnPrefix + "_FullName",solnPrefix + "_ClientIdentifier",solnPrefix + "_FirstName",solnPrefix + "_ClientIdentifier",solnPrefix + "_LastName"];
			
			/*Define base SQL select against a particular case type*/
			var sqlBase = "SELECT  [Id] , " +
			  "[ClassDescription], [DateLastModified], [FolderName], " + additionalProps +
			  " FROM ["+className+"] ";

			/*Define optional where clause, to specify Working / Complete / etc.*/
			//var sqlWhere=" WHERE ["+solnPrefix+"_ClientIdentifier]='"+userId+"'";
			var ceQuery = sqlBase ;
			console.info("ceQuery",ceQuery);
			var searchQuery = new SearchQuery({repository: repo,
				   pageSize:0,
				   query:ceQuery,
				   resultsDisplay: {columns: colsToRet},
				   retrieveAllVersions:false,
				   retrieveLatestVersion:true});

			var caseCount = 0;
			_self.patientChoices = [];
			searchQuery.search(function(resultSet){
			try {
				console.debug("Search returned ",resultSet);
				caseCount = resultSet.totalCount;
				console.debug("Working Case Count = " + caseCount);
				if(caseCount>0){
					array.forEach(resultSet.items, function(oneItem){
						console.debug("oneItem",oneItem);
						
						var oneChoice = {
							label:oneItem.attributes[solnPrefix+"_FirstName"] +" "+oneItem.attributes[solnPrefix+"_LastName"],
							value:oneItem.attributes[solnPrefix+"_ClientIdentifier"]
						};
						_self.patientChoices.push(oneChoice);
					});
					
					console.debug("patientChoices",_self.patientChoices);
					
				}else{
					console.warn("No patient cases found  ");
				}

			}catch (Error) {
				console.error (Error.toString());
			}
			});
		}
		
		
	});
});	