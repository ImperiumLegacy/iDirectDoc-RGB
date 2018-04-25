package com.idirectdoc.icm.custom.plugin.services;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.ecm.extension.PluginLogger;
import com.ibm.ecm.extension.PluginResponseUtil;
import com.ibm.ecm.extension.PluginService;
import com.ibm.ecm.extension.PluginServiceCallbacks;
import com.ibm.ecm.json.JSONMessage;
import com.ibm.ecm.json.JSONResponse;
import com.ibm.json.java.JSONObject;

/**
 * Provides an abstract class that is extended to create a class implementing
 * each service provided by the plug-in. Services are actions, similar to
 * servlets or Struts actions, that perform operations on the IBM Content
 * Navigator server. A service can access content server application programming
 * interfaces (APIs) and Java EE APIs.
 * <p>
 * Services are invoked from the JavaScript functions that are defined for the
 * plug-in by using the <code>ecm.model.Request.invokePluginService</code>
 * function.
 * </p>
 * Follow best practices for servlets when implementing an IBM Content Navigator
 * plug-in service. In particular, always assume multi-threaded use and do not
 * keep unshared information in instance variables.
 */
public class ConfigurationService extends PluginService {

	/**
	 * Returns the unique identifier for this service.
	 * <p>
	 * <strong>Important:</strong> This identifier is used in URLs so it must
	 * contain only alphanumeric characters.
	 * </p>
	 * 
	 * @return A <code>String</code> that is used to identify the service.
	 */
	public String getId() {
		return "ConfigurationService";
	}


	/**
	 * Performs the action of this service.
	 * 
	 * @param callbacks
	 *            An instance of the <code>PluginServiceCallbacks</code> class
	 *            that contains several functions that can be used by the
	 *            service. These functions provide access to the plug-in
	 *            configuration and content server APIs.
	 * @param request
	 *            The <code>HttpServletRequest</code> object that provides the
	 *            request. The service can access the invocation parameters from
	 *            the request.
	 * @param response
	 *            The <code>HttpServletResponse</code> object that is generated
	 *            by the service. The service can get the output stream and
	 *            write the response. The response must be in JSON format.
	 * @throws Exception
	 *             For exceptions that occur when the service is running. If the
	 *             logging level is high enough to log errors, information about
	 *             the exception is logged by IBM Content Navigator.
	 */
	public void execute(PluginServiceCallbacks callbacks, HttpServletRequest request, HttpServletResponse response) throws Exception {
		PluginLogger logger = callbacks.getLogger();
		logger.logEntry(this, "execute");
		JSONResponse jsonResponse = new JSONResponse(); 
		
		try {
			if (validateRequest(callbacks, request, jsonResponse)) {
				String configAction = request.getParameter("configAction");
				
				if (configAction.equalsIgnoreCase("save")) {
					String data = request.getParameter("data");
					
					Hashtable <String, String> configData = new Hashtable<String, String>();
					configData.put("1", data);
					callbacks.saveConfiguration(configData);
					
					jsonResponse.put("success", true);
				} else { // any action other than "save" will simply load the configuration data and return it to the client
					String[] configData = callbacks.loadConfigurations(new String[] {"1"});
					if (configData != null) {
						// first plugin load will be empty
						if (configData[0] != null) {
							jsonResponse.put("data", JSONObject.parse(configData[0]));
						}
					}
				}
			}
		} catch (Exception ex) {
			logger.logError(this, "execute", ex);
			jsonResponse.addErrorMessage(new JSONMessage(20000, "Error occurred attempting to process a request to the ConfigurationService", null, null, null, null));
		} finally {
			logger.logExit(this, "execute");
			// Send response to the client
			PluginResponseUtil.writeJSONResponse(request, response, jsonResponse, callbacks, "ConfigurationService");
		}
	}
	
	/**
	 * Determines if the request contains all required parameters
	 * 
	 * @param callbacks
	 *            An instance of the <code>PluginServiceCallbacks</code> class
	 *            that contains several functions that can be used by the
	 *            service. These functions provide access to the plug-in
	 *            configuration and content server APIs.
	 * @param request
	 *            The <code>HttpServletRequest</code> object that provides the
	 *            request. The service can access the invocation parameters from
	 *            the request.
	 * @param jsonResponse
	 * 			  An instance of the <code>JSONResponse</code> class, containing 
	 * 			  the service response to the client.
	 * @return true if the request contains all require parameters and false if it does not
	 */
	private boolean validateRequest(PluginServiceCallbacks callbacks, HttpServletRequest request, JSONResponse jsonResponse) {
		PluginLogger logger = callbacks.getLogger();
		logger.logEntry(this, "validateRequest");
		
		if (request.getParameter("configAction") == null) {
			jsonResponse.addErrorMessage(new JSONMessage(20001, "Missing required parameter \"configAction\"", null, null, null, null));
			logger.logError(this, "validateRequest", "Missing required request parameter \"configAction\"");
			logger.logExit(this, "validateRequest", "Request does not contain all required parameters");
			return false;
		}
		
		logger.logExit(this, "validateRequest", "Request contains the required parameters");
		return true;
	}
}
