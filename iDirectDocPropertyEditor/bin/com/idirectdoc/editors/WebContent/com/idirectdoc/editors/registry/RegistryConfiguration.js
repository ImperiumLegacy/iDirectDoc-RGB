define([
	"dojo/_base/declare",
	"com/idirectdoc/editors/ICDCodeEditor"
], function(declare, ICDCodeEditor) {

	return {
		editors: {
			editorConfigs: {
				"ICDCodeEditor": {
					label: "ICDCodeEditor",
					editorClass: ICDCodeEditor
				}
			},
			mappings: {
				types: {
					"string": {
						single: {
							editorConfigs: [
								"ICDCodeEditor"
							]
						}
					}
				}
			}
		}
	};
});
