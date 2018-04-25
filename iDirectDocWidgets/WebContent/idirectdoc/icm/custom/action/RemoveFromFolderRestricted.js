define([
	"dojo/_base/declare",
	"dojo/_base/lang",
	"dojo/_base/array",
	"icm/action/contentitem/RemoveFromFolder",
	], function(declare, lang, array, RemoveFromFolder) {

		return declare("osc.icm.custom.action.RemoveFromFolderRestricted", [RemoveFromFolder], {

			isEnabled: function()
			{
				console.debug("inside RemoveFromFolderRestricted isenabled");
				var selectedItem = this.getSelectedItem();
				var currentUserId = ecm.model.desktop.userId;
				console.debug("selectedItem",selectedItem);
				console.debug("creator",selectedItem.attributes.Creator);
				console.debug("currentUserId",currentUserId);
				if(selectedItem.attributes.Creator!= currentUserId)
					return false;
				
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