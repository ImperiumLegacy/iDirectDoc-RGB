define([
	"dojo/_base/declare",
	"dojo/_base/lang",
	"dojo/_base/array",
	"icm/action/task/StopToDoTask",
	], function(declare, lang, array, StopToDoTask) {

		return declare("osc.icm.custom.action.StopToDoTaskRestricted", [StopToDoTask], {

			isEnabled: function()
			{
				console.debug("inside StopToDoTaskRestricted isenabled");
				
				var todoTask = this.getActionContext("ToDoEditable");
				console.debug("todoTask",todoTask);
				if(todoTask != null && todoTask.length > 0){
					console.debug("todoTask",todoTask);
					var creator = todoTask[0].getTask().creator;
					console.debug("creator",creator);
					var currentUserId = ecm.model.desktop.userId;
					console.debug("currentUserId",currentUserId);
					if(creator!=currentUserId)
						return false;
				}
			
				return this.inherited(arguments);
			},
			
			isVisible: function()
			{
				return this.inherited(arguments);
			},
			
			execute: function()
			{
				this.inherited(arguments);
			},
			
			_eoc_:null

		});
});