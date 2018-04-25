
define(["dojo/_base/declare", 
	"dojo/_base/lang",
	"dojo/_base/array",
	"dojo/_base/event",
	"dojo/dom-attr",
	"dojo/dom-class",
	"dojo/dom-geometry",
	"dojo/dom-style",
	"dojo/keys",	
	"ecm/widget/dialog/BaseDialog",
	"dijit/form/CheckBox",
	"dijit/form/Button",	
	"dojo/text!./templates/GenerateLetterDialog.html",	
	],

	function(declare, lang, array, event, domAttr, domClass, domGeom, keys,  domStyle,
		BaseDialog, CheckBox,Button, template
		){

		return declare("td.icm.custom.dialog.GenerateLetterDialog", [BaseDialog], {
			
		constructor: function(args){
			
			if(args){
		
			}
		},	

		/** 
		 * Clean up allocated structures and destory the dialog HTML when the dialog is closed.
		 *
		 * @private
		 */		
		clean: function() {
			console.debug("In Clean");
		},

		/** 
		 * Called after widget creation to initialize the widget and connect events.
		 *
		 * @private
		 */
		postCreate: function()
		{
			console.debug("In postCreate");			
			
			this.inherited(arguments);				
		},

		
		
		/**
		 * @private
		 */
		destroy : function(){
			console.debug("In Destroy");
			this.inherited(arguments);
		},
		
	   hide : function(){
			console.debug("In hide");
			this.inherited(arguments);
			
		}		

	});
});
