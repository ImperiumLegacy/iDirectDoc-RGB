define([ 
	"dojo/_base/declare",
	"dojo/_base/lang",
	"dojo/_base/array",
	"icm/base/_BaseWidget",
	"icm/base/BasePageWidget",    
	"dijit/_TemplatedMixin",
	"dijit/_WidgetsInTemplateMixin",
	"ecm/model/Desktop",
	"icm/pgwidget/casesearch/CaseSearch"], 
		function(declare, lang, array, _BaseWidget, BasePageWidget, _TemplatedMixin, _WidgetsInTemplateMixin, Desktop, CaseSearch){

    return declare("idirectdoc.icm.custom.pgwidget.specificcasesearch.SpecificCaseSearch", [ CaseSearch], {
		
    	postCreate: function(){
    		console.debug("widgetProperties",this.widgetProperties);
    		
    		//Override the solution getCaseTypes function only when called from this widget
    		/*this.solution.retrieveCaseTypes(lang.hitch(this,function(caseTypes){
    				var allCaseTypes = caseTypes;
    				console.debug("allCaseTypes",allCaseTypes);
    				console.debug("this.solution.getCaseTypes",this.solution.getCaseTypes());
    				var prefix = this.solution.prefix;
    				var newSolution = new Object();
    				var allowedCaseTypes = this.widgetProperties["listofcasetypes"];
    				newSolution.getCaseTypes = function(){
    					console.debug("Arguments",arguments);
    		    		var allowedCaseTypesArr = null;
    		    		if(allowedCaseTypes)
    		    			allowedCaseTypesArr=allowedCaseTypes.split(",");
    					console.info("this and allowedCaseTypesArr",this, allowedCaseTypesArr);
    					if(allowedCaseTypesArr){
	    					return array.filter(allCaseTypes, function(oneCaseType){
	    						console.debug("oneCaseType",oneCaseType);
	    						array.forEach(allowedCaseTypesArr,function(oneAllowedCaseType){
		    						console.debug("Matching oneCaseType and oneAllowedCaseType",oneCaseType,oneAllowedCaseType);
	    							return oneCaseType.id==prefix+"_"+oneAllowedCaseType;
	    						});
	    					});
    					}else{
    						return allCaseTypes;
    					}
        			},allowedCaseTypes;
    				
    				lang.mixin(this.solution,newSolution);
    			})
    		);*/
    	
    		this.inherited(arguments);    		
		},
		
		/*
		* Override the union function and filter to only properties for allowed case types
		*/
		_constructSearchViewPropertyDefs: function(propDefs) {
			var searchDefs = this.inherited(arguments);
			console.debug("searchDefs",searchDefs);
			
			var allowedCaseTypes = this.widgetProperties["listofcasetypes"];
			var allCaseTypes = this.solution.getCaseTypes();
			var allowedCaseTypesArr = null;
			var prefix = this.solution.prefix;
			var ourCaseTypes = [];
			if(allowedCaseTypes){
				allowedCaseTypesArr=allowedCaseTypes.split(",");
				ourCaseTypes= array.filter(allCaseTypes, function(oneCaseType){
					console.debug("oneCaseType",oneCaseType);
					var matchFound = array.some(allowedCaseTypesArr,function(oneAllowedCaseType){
						console.debug("Matching with oneAllowedCaseType",prefix+"_"+oneAllowedCaseType);
						if(oneCaseType.id==prefix+"_"+oneAllowedCaseType){
							console.debug("Match found!!");
							return true;
						}
					});
					
					console.debug("Match var ", matchFound);
					return matchFound;
				});
			}
			
			console.debug("ourCaseTypes",ourCaseTypes);
			var allowedSearchDefs = array.filter(searchDefs, function(oneSearchDef){
				return array.some(ourCaseTypes,function(oneAllowedCaseType){
					console.debug("Matching for oneAllowedCaseType",oneAllowedCaseType);
					return array.some(oneAllowedCaseType.searchView.fields,function(oneAllowedSearchProp){
						console.debug("Matching oneSearchDef and oneAllowedCaseType",oneSearchDef,oneAllowedSearchProp);
						if( oneSearchDef.id==oneAllowedSearchProp.name){
							console.debug("Found a match");
							return true;
						}
					});
				});
				
			});
			
			return (allowedSearchDefs?allowedSearchDefs:searchDefs);
		},
		
		
	});
});