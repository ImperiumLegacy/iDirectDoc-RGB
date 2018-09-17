require([
	"dojo/_base/lang",
	"dojo/_base/array",
	"dojo/dom-construct",
	"dojo/sniff",
	"dojo/promise/all",
	"dojo/Deferred",
	"dojo/aspect",
	"dojo/json",
	"ecm/model/Desktop",
	"ecm/model/admin/PluginConfig"
], function(lang, array, domConstruct, sniff, all, Deferred, aspect, json, Desktop, PluginConfig) {

	var extensions = [
		{
			packages:
			{
				"com/idirectdoc/editors": "/navigator/plugin/iDirectDocEditor/getResource/com/idirectdoc/editors"
			},
			css: [
				  "/navigator/plugin/iDirectDocEditor/getResource/com/idirectdoc/editors/resources/ICDCodeEditor.css",
				  "/navigator/plugin/iDirectDocEditor/getResource/com/idirectdoc/editors/autocomplete/autocomplete-lhc_jQueryUI.min.css"
			],
			bootstrapModule: "com/idirectdoc/editors/Initializer",
			bootstrapMethod: "initialize"
		}
	]; // End of extension definitions.


	// Example of accessing the plug-in configuration values
	aspect.after(Desktop, "onLogin", lang.hitch(this, function(response){
		var pluginConfig = PluginConfig.createPluginConfig("iDirectDocEditor");
		pluginConfig.getPluginConfig(function(){
			var c = pluginConfig.getConfiguration();
			var config = c && json.parse(c);
			console.log("Plug-in Config=", config);
		});
	}), true);


	// !!! DO NOT MODIFY THE CODE BELOW !!!
	// Load the extension packages
	var promises = [];
	array.forEach(extensions, function(extension) {
		if (extension.packages) {
			// Set up the promise;
			var deferred = new Deferred();
			promises.push(deferred.promise);

			// Load the module packages.
			require({
				paths: extension.packages
			});

			// Load the stylesheets.
			array.forEach(extension.css, function(url) {
				if (sniff("ie")) {
					document.createStyleSheet(url);
				} else {
					domConstruct.create("link", {
						rel: "stylesheet",
						type: "text/css",
						href: url
					}, document.getElementsByTagName("head")[0]);
				}
			});

			// Call the bootstrap method.
			if (extension.bootstrapModule && extension.bootstrapMethod) {
				require([extension.bootstrapModule], function(bootstrapClass) {
					var bootstrap = new bootstrapClass();
					if (lang.isFunction(bootstrap[extension.bootstrapMethod])) {
						bootstrap[extension.bootstrapMethod]();
						deferred.resolve();
					} else {
						deferred.resolve();
					}

				});
			} else {
				deferred.resolve();
			}
		}
	});
	all(promises);
});

