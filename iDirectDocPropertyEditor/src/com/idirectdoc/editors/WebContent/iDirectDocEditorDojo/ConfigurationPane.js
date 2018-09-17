define([
		"dojo/_base/declare",
		"dojo/_base/json",
		"dojo/_base/lang",
		"dojo/aspect",
		"dijit/_TemplatedMixin",
		"dijit/_WidgetsInTemplateMixin",
		"ecm/widget/admin/PluginConfigurationPane",
		"dojo/text!./templates/ConfigurationPane.html"
	],
	function(declare, json, lang, aspect, _TemplatedMixin, _WidgetsInTemplateMixin, PluginConfigurationPane, template) {

		return declare("com.ConfigurationPane", [PluginConfigurationPane, _TemplatedMixin, _WidgetsInTemplateMixin], {
		
		templateString: template,
		widgetsInTemplate: true,
	
		load: function(callback) {
			var config = this.configurationString && json.fromJson(this.configurationString) || {};
			this.externalICDCodeUrlBox.set("value", config.externalICDCodeUrl || "", false);

			if(callback){
				callback();
			}
		},
		
		_onFieldChange: function(e){
			var config = this.configurationString && json.fromJson(this.configurationString) || {};
			config.externalICDCodeUrl = this.externalICDCodeUrlBox.get("value");

			this.configurationString = json.toJson(config);
			this.onSaveNeeded(true);
		},

		validate: function() {
			return true;
		}
	});
});
