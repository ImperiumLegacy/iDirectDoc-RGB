package com.idirectdoc.rest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.ibm.json.java.JSONObject;
import com.idirectdoc.common.RestServiceProperties;
import com.idirectdoc.servlets.EasyScripts;
import com.ibm.json.java.JSONArray;

@Path("/ProcedureCodes")
@Consumes(MediaType.WILDCARD)
public class ICD10Codes{
	String icdURL="";
	static final  String PROP_ICD_URL= "ICD_URL";
	Logger logger =null;
	
	public ICD10Codes() {
		logger = Logger.getLogger(EasyScripts.class.getName());
		icdURL = RestServiceProperties.serviceProperties.getProperty(PROP_ICD_URL);
	}
	
	@Path("/ICD10")
	@GET
	@Produces(MediaType.TEXT_HTML) 
	public String getICD10Codes(@QueryParam("name") String query) throws Exception{
		JSONArray icd10Codes = new JSONArray();
		JSONObject retObj = new JSONObject();
		
		//Search for the patient
	    HttpGet httpGet = new HttpGet(icdURL+(query!=null?URLEncoder.encode(query, "UTF-8"):""));
	    httpGet.addHeader("accept", "text/json");
	    httpGet.addHeader("Content-Type", "text/json");
	    HttpClient  httpClient    = HttpClientBuilder.create().build();
	    HttpResponse getSearchResponse =httpClient.execute(httpGet);
	    
	    JSONArray responseSearchJsonObj = getHttpResponseJSON(getSearchResponse);
	    Long count = (Long)responseSearchJsonObj.get(0);
		if(count>0){
			JSONArray codes = (JSONArray)responseSearchJsonObj.get(3);
			for (int i = 0; i < codes.size(); i++) {
				JSONArray oneCode = (JSONArray)codes.get(i);
				String codeText = oneCode.get(0)+ " " + oneCode.get(1);
				JSONObject oneCodeObj = new JSONObject();
				oneCodeObj.put("id", i);
				oneCodeObj.put("label", codeText);
				oneCodeObj.put("name", codeText);
				icd10Codes.add(oneCodeObj);
			}
		}
		retObj.put("items", icd10Codes);
		retObj.put("numRows", icd10Codes.size());
		retObj.put("identity","id");
		
		return retObj.toString();
		
	}
	
	private JSONArray getHttpResponseJSON(HttpResponse httpResponse) throws Exception{
		//Read the response
	    Header encoding = httpResponse.getEntity().getContentEncoding();
	    String encodingStr="UTF-8";;
	    
	    if(encoding!=null)
	    	encodingStr=encoding.getValue();
	    
	    BufferedReader in = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(),encodingStr));
	    
	    StringBuilder sb = new StringBuilder();
	    String line ="";
	    // Read response until the end
	    while ((line = in.readLine()) != null) { 
	        sb.append(line); 
	    }

	    String responseJson = sb.toString();
	    System.out.println("responseJson="+ responseJson );
	    JSONArray responseJsonObj = JSONArray.parse(responseJson);
	    return responseJsonObj;
	}

}
