require(["dojo/_base/declare",
         "dojo/_base/lang",
         "dojo/aspect",
         "icm/widget/SelectorTabContainer",
         "dojo/dom-construct",
         "dijit/registry", 
         "ecm/model/Desktop",
         "dojo/aspect",
         "dojo/dom-style",
         "dojo/query"], 
function(declare, lang, aspect, SelectorTabContainer, domConstruct, registry, Desktop, aspect, domStyle, query) {		
	/**
	 * Use this function to add any global JavaScript methods your plug-in requires.
	 */
	var icmContextRoot = "/iDirectDocWidgets";
	
	var loadCSS = function(cssFileUrl){
		if (dojo.isIE) {
			document.createStyleSheet(cssFileUrl);
		} else {
			var head = document.getElementsByTagName("head")[0];
			var link = document.createElement("link");
			link.rel = "stylesheet";
			link.type = "text/css";
			link.href = cssFileUrl;
			head.appendChild(link);
		}
	};

	var loadJS = function(scriptUri){
		try{
			dojo._loadUri(scriptUri);
		}catch(e){
			console.log("TDICMCustomPlugin loading script fail ... "+scriptUri);
		}
	};
	
	var paths = {
			"idirectdoc/icm/custom":icmContextRoot+"/idirectdoc/icm/custom"
		};
	require({paths:paths});
		
	//not sure which one is necessary, test and remove ...
	var cssFileUris = [
		icmContextRoot + "/idirectdoc/icm/custom/css/iDirectDocPlugin.css"
	];

	for(var i in cssFileUris){
		var cssFileUri = cssFileUris[i];
		loadCSS(cssFileUri);
	}
	
	//Monkey patching the login pane to show additional image
	var selectorTabContainer = icm.widget.SelectorTabContainer.prototype;
	var oldPCTC = selectorTabContainer.postCreate;
	 
    //modify the Dijit's prototype
	selectorTabContainer.postCreate = function(){
		console.debug('Inside modify selectorTabContainer postmixin');
		console.debug("selectorTabContainer.tabPosition",this.tabPosition);
		//this.tabPosition = "left-h";

	    // call the original prototype method;
	    // we still want the original functionality to fire
		oldPCTC.call(this, arguments);
	};
	
	try{
		aspect.after(Desktop, "onLogin", 
			function(repo){
				console.debug("Logged in...",repo);
				//.dijitIcon.person
				console.debug('person icont',query(".dijitIcon.person"));
				var domNode = query(".dijitIcon.person")
				/*domNode[0].style({
					backgroundImage: "url('/iDirectDocWidgets/idirectdoc/icm/custom/images/"+Desktop.userId.toLowerCase()+".jpg')",
					backgroundSize: "32px 32px;"
				});*/
				console.debug("domNode",domNode);
				domStyle.set(domNode[0],
					{
						backgroundImage: "url('/iDirectDocWidgets/idirectdoc/icm/custom/images/"+Desktop.userId.toLowerCase()+".jpg')",
						backgroundSize: "32px",
						borderRadius: "20%"
					}
				);
				
			}
		);		
		 
	}catch(e){
		console.error("Error in plugin",e);
	}
	
});
