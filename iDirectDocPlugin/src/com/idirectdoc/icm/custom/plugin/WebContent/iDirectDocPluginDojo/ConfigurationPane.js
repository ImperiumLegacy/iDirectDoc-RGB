define([
		"dojo/_base/declare",
		"dojo/_base/lang",
		"dojo/_base/json",
		"dijit/_TemplatedMixin",
		"dijit/_WidgetsInTemplateMixin",
		"ecm/model/Request",
		"ecm/widget/HoverHelp",
		"ecm/widget/ValidationSimpleTextarea",
		"ecm/widget/admin/PluginConfigurationPane",
		"dojo/text!./templates/ConfigurationPane.html"
	],
	function(declare,  lang, dojojson, _TemplatedMixin, _WidgetsInTemplateMixin, Request,HoverHelp, ValidationTextarea, PluginConfigurationPane, template) {

		return declare("iDirectDocPluginDojo.ConfigurationPane", [ PluginConfigurationPane, _TemplatedMixin, _WidgetsInTemplateMixin], {
		
		templateString: template,
		widgetsInTemplate: true,
	
		load: function(callback) {
			console.debug("Insideload");
			Request.invokePluginService("iDirectDocPlugin", "ConfigurationService",
					{
						requestParams: {
							configAction: "load"
						},
						
						requestCompleteCallback: lang.hitch(this, function(response) {	// success
							console.debug("response=",response);
							if (response.data && response.data.watsonaskurl) {
								this.watsonAskURL.set("value", response.data.watsonaskurl);
							}
							if (response.data && response.data.watsondictationurl) {
								this.watsonDictationURL.set("value", response.data.watsondictationurl);
							}
							if (response.data && response.data.watsonvisualrecognitionurl) {
								this.watsonVisualRecognitionURL.set("value", response.data.watsonvisualrecognitionurl);
							}
							if (response.data && response.data.videoconferenceurl) {
								this.videoConferenceURL.set("value", response.data.videoconferenceurl);
							}
						})
					}
				);
		},
		
		_onFieldChange: function() {
			this.onSaveNeeded(true);					
		},
		
		validate: function() {
			
			var jsonStr = this.watsonDictationURL.get("value");
			try {
				console.debug("validating ..",jsonStr);
				//dojo.fromJson(jsonStr);	
			} catch (e) {
				console.error("Invalid json",e);
				return false;
			}
			
			
			return true;
		},
		
		save: function() {		
			var watsonAskURL = this.watsonAskURL.get("value");
			var watsonDictationURL = this.watsonDictationURL.get("value");
			var watsonVisualRecognitionURL = this.watsonVisualRecognitionURL.get("value");
			var videoConferenceURL = this.videoConferenceURL.get("value");
			
			console.debug("save watsonAskURL:",watsonAskURL);
			console.debug("save watsonDictationURL:",watsonDictationURL);
			console.debug("save watsonVisualRecognitionURL:",watsonVisualRecognitionURL);
			console.debug("save videoConferenceURL:",videoConferenceURL);
			
			if (watsonDictationURL.length > 0) {
				var data = dojojson.toJson({
					watsonaskurl: watsonAskURL,
					watsondictationurl: watsonDictationURL,
					watsonvisualrecognitionurl: watsonVisualRecognitionURL,
					videoconferenceurl: videoConferenceURL
				});
				
				// save configuration data
				Request.invokePluginService("iDirectDocPlugin", "ConfigurationService",
					{
						requestParams: {
							configAction: "save",
							data: data
						}
					}
				);
			}
		},
		
		_validateURL: function(value){
			console.debug("_validateURL:",value)
			try {
				//dojo.fromJson(value);	
				this.onSaveNeeded(true);	
				return true;
			} catch (e) {
				console.error(e);
				return false;
			}
		}
	});
});
