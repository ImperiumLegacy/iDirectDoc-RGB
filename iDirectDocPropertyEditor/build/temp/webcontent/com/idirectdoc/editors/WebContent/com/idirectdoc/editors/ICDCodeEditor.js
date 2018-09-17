define([
	"dojo/aspect",
	"dojo/_base/declare",
	"dojo/_base/lang",
	"dijit/_WidgetBase",
	"dijit/_TemplatedMixin",
	"dijit/_WidgetsInTemplateMixin",
	"dojo/text!./templates/ICDCodeEditor.html",
	"dijit/Dialog", // used in template
	"dijit/form/Button", // used in template
	"dijit/form/CheckBox", // used in template
	"dijit/form/TextBox", // used in template
	"dijit/form/FilteringSelect",
	"idx/form/_CssStateMixin",
	"idx/form/_CompositeMixin",
	"idx/form/_ValidationMixin",
	"pvr/widget/editors/mixins/_EditorMixin",
	"dojox/data/QueryReadStore",
	
], function(aspect, declare, lang, _WidgetBase, _TemplatedMixin, _WidgetsInTemplateMixin, template, Dialog, Button, CheckBox, TextBox, FilteringSelect,
		_CssStateMixin, _CompositeMixin, _ValidationMixin, _EditorMixin, QueryReadStore)
{
	return declare([_WidgetBase, _TemplatedMixin, _WidgetsInTemplateMixin, _CssStateMixin, _CompositeMixin, _ValidationMixin, _EditorMixin], {

		templateString: template,
		baseClass: "ICD10CodeEditor",
		oneuiBaseClass: "",
		_self: this,
		
		postCreate: function(){
			//aspect.after(this.selBtn, "onClick", lang.hitch(this, "onSel"));
			//aspect.after(this.dlg, "onExecute", lang.hitch(this, "onOk"));
			this.icdListRef = this.icdList;
			this.icdListRef.set("queryExpr", "*${0}*");
			
			//this.icdTextboxRef = this.textbox;
			
			this._event = { "input": "onChange", "blur": "_onBlur", "focus": "_onFocus" };

			
			this.inherited(arguments);
		},

		_setValueAttr: function(/*String*/val){
			console.debug("_setValueAttr",arguments,this);
			// You MUST implement this method to communicate with the controller
			this.currentValue = val;
			//this.icdListRef.set("displayedValue",val);
			try {
				//if(this.icdTextboxRef)
				//	this.icdTextboxRef.set("value", val);
				//else
				//	console.warn("this.icdTextboxRef is not available, value is ", this.icdTextboxRef);
			} catch (e) {
				console.error("Error in _setValueAttr",e);
			}
		},

		_getValueAttr: function(){
			console.debug("_getValueAttr",arguments,this);
			// You MUST implement this method to communicate with the controller
			console.debug("this.icdListRef.displayedValue",this.icdListRef.displayedValue);
			console.debug("this.currentValue",this.currentValue);
			var retVal = (this.icdListRef.displayedValue?this.icdListRef.displayedValue:this.currentValue);
			
			console.debug("returning",retVal);
			return retVal ;
		},

		onSel: function(){
			console.debug("onSel",this,this.get("value"));
			//var value = this.get("value");
			//this.icdTextboxRef.set("value", value);
			this.dlg.show();
		},

		onOk: function(){
			console.debug("onOk", arguments, this.icdListRef);
			//this.set("value", this.icdList.item.name);
			var selectedVal = this.icdListRef.displayedValue;
			
			this.set("value",  selectedVal);
			//this.icdTextboxRef.set("value", selectedVal);
			this.currentValue = selectedVal;
			
			// Notify the controller that the value has been changed
			this.onChange(selectedVal);
		},

		onChange: function(){
			console.debug("onChange",arguments);
			this.inherited(arguments);
			// A stub function to be connected to
		},
		
		_onFocus: function(){
			console.debug("_onFocus",arguments);
		},
		
		focus: function(){
			console.debug("focus", arguments, this.get("value"));
			this.inherited(arguments);
			var value = this.get("value");
			//this.icdTextboxRef.set("value", value);
			//this.dlg.show();
		}

	});
});
