package com.idirectdoc.icm.custom.plugin.actions;

import java.io.IOException;
import java.util.Locale;

import com.ibm.ecm.extension.PluginAction;
import com.ibm.json.java.JSONObject;

public class ExternalSystemDialog extends PluginAction {

	@Override
	public String getActionFunction() {
		return "performAction";
	}

	@Override
	public String getIcon() {
		return "ScriptAction.gif";
	}

	@Override
	public String getId() {
		return "idirectdoc.icm.custom.action.ExternalSystemDialog";
	}

	@Override
	public String getName(Locale arg0) {
		return "Open external system in modal dialog";
	}

	@Override
	public String getPrivilege() {
		return "";
	}

	@Override
	public String getServerTypes() {
		// TODO Auto-generated method stub
		return "p8";
	}

	@Override
	public boolean isMultiDoc() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getActionModelClass() {
		return "idirectdoc.icm.custom.action.ExternalSystemDialog";
	}

	@Override
	public boolean isGlobal() {
		return true;
	}
	
	@Override
	public JSONObject getAdditionalConfiguration(Locale locale) {
		String jsonString = "{\r\n" +
				"	        \"ICM_ACTION_COMPATIBLE\": true,\r\n" +
				"            \"name\": \"External System Dialog\",\r\n" +
				"	    \"description\": \"Open external system in modal dialog\",\r\n" +
				"            \"properties\": [\r\n" +
				"				{\r\n" +
				"                    \"id\": \"url\",\r\n" +
				"                    \"title\": \"URL To external system\",\r\n" +
				"                    \"defaultValue\": \"\",\r\n" +
				"                    \"type\": \"string\",\r\n" +
				"                    \"isLocalized\":false\r\n" +
				"               },\r\n" +
				"				{\r\n" +
				"                    \"id\": \"roles\",\r\n" +
				"                    \"title\": \"Restrict to Roles(comma separated)\",\r\n" +
				"                    \"defaultValue\": \"\",\r\n" +
				"                    \"type\": \"string\",\r\n" +
				"                    \"isLocalized\":false\r\n" +
				"               },\r\n" +
				"            ],\r\n" +
				"		\"events\":[\r\n" +
				"			{\"id\":\"idirectdoc.DialogClosed\",\r\n" +
				"			\"title\":\"External System Action Cancelled \",\r\n" +
				"			\"direction\":\"published\",\r\n" +
				"			\"type\":\"broadcast\",\r\n" +
				"			\"description\":\"The external system dialog was closed without accepting the result.\"\r\n" +
				"			},\r\n" +
				"			{\r\n" +
				"			\"id\":\"idirectdoc.DialogActionCompleted\",\r\n" +
				"			\"title\":\"External System action Accepted \",\r\n" +
				"			\"direction\":\"published\",\r\n" +
				"			\"type\":\"broadcast\",\r\n" +
				"			\"description\":\"The external system action completed and user accepted the result. \"\r\n" +
				"			},\r\n" +
				"		]\r\n" +
				"	}";
		
		try {
			return JSONObject.parse(jsonString);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
	
}
