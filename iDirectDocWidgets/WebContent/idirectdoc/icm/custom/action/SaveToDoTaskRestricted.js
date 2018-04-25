define([
	"dojo/_base/declare",
	"dojo/_base/lang",
	"dojo/_base/array",
	"icm/action/task/SaveToDoTask",
	], function(declare, lang, array, SaveToDoTask) {

		return declare("osc.icm.custom.action.SaveToDoTaskRestricted", [SaveToDoTask], {

			isEnabled: function()
			{
				console.debug("inside isenabled");
				
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