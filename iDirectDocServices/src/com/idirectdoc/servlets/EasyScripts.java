package com.idirectdoc.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.filenet.api.collection.IndependentObjectSet;
import com.filenet.api.collection.RepositoryRowSet;
import com.filenet.api.core.IndependentObject;
import com.filenet.api.core.IndependentlyPersistableObject;
import com.filenet.api.query.SearchSQL;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import com.idirectdoc.common.RestServiceProperties;
import com.idirectdoc.dataprovider.CPEDataProvider;

/**
 * Servlet implementation class EasyScripts
 */
@WebServlet(name = "EasyScripts", description = "Easy Scripts Prescription Page", urlPatterns = { "/EasyScripts" }, loadOnStartup=1)
public class EasyScripts extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String cpeURL = "";
    private String cpeDomain = "";
    private String cpeObjStore = "";
    private String ePrescribeUrl = "";
    private String ePrescribeSubDomain = "";
    private String ePrescribeAppKey = "";
    private String ePrescribeAppSecret = "";
    
	static final  String PROP_CPE_URL= "CPE_URL";
	static final  String PROP_CPE_DOMAIN= "CPE_DOMAIN";
	static final  String PROP_CPE_OBJSTORE= "CPE_OBJSTORE";
	static final  String PROP_EPRESCRIBE_URL= "EPRESCRIBE_URL";
	static final  String PROP_EPRESCRIBE_SUBDOMAIN = "EPRESCRIBE_SUBDOMAIN";
	static final  String PROP_EPRESCRIBE_APPKEY = "EPRESCRIBE_APP_KEY";
	static final  String PROP_EPRESCRIBE_APPSECRET = "EPRESCRIBE_APP_SECRET";
	
	
	Logger logger =null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EasyScripts() {
        super();
        logger = Logger.getLogger(EasyScripts.class.getName());
        
        if(cpeURL.isEmpty()){
        	try {
        		RestServiceProperties.init();
    			cpeURL = RestServiceProperties.serviceProperties.getProperty(PROP_CPE_URL);
    			cpeDomain = RestServiceProperties.serviceProperties.getProperty(PROP_CPE_DOMAIN);
    			cpeObjStore = RestServiceProperties.serviceProperties.getProperty(PROP_CPE_OBJSTORE);
    			ePrescribeUrl = RestServiceProperties.serviceProperties.getProperty(PROP_EPRESCRIBE_URL);	
    			ePrescribeSubDomain = RestServiceProperties.serviceProperties.getProperty(PROP_EPRESCRIBE_SUBDOMAIN);
    			ePrescribeAppKey = RestServiceProperties.serviceProperties.getProperty(PROP_EPRESCRIBE_APPKEY);
    			ePrescribeAppSecret = RestServiceProperties.serviceProperties.getProperty(PROP_EPRESCRIBE_APPSECRET);
    			
			} catch (Exception e) {
				logger.severe(e.getMessage());
				e.printStackTrace();
			}
        	
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestor = request.getParameter("Requestor");
		String patient = request.getParameter("Patient");
		String ePrescribeUID=null;
		String ePrescribePWD=null;
		
		//Get the ePrescribe Creds for Requestor
		String sql = "Select IDC_ePrescribeID,IDC_ePrescribePassword from CmAcmCaseFolder Where IDC_ClientIdentifier='"+requestor+"'";
		CPEDataProvider ceDp = new CPEDataProvider();
		ceDp.setConnectURI(cpeURL);
		ceDp.setDomain(cpeDomain);
		ceDp.setCurrentOSName(cpeObjStore);
		try {
			IndependentObjectSet objSet = ceDp.executeSearch(sql, "TARGET");
			Iterator iter = objSet.iterator();
			if(iter.hasNext()){
				IndependentObject onePrescriber = (IndependentObject) iter.next();
				ePrescribeUID = onePrescriber.getProperties().getStringValue("IDC_ePrescribeID");
				ePrescribePWD = onePrescriber.getProperties().getStringValue("IDC_ePrescribePassword");
				if(iter.hasNext())
					throw new Exception("More than one prescriber found for id "+ requestor);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException(e.getMessage());
		}
		
		
		HttpPost httpPost = new HttpPost(ePrescribeUrl+"/Api/Public/V3/"+ePrescribeSubDomain+"/Account/Authenticate");
		//HttpPost httpPost = new HttpPost("https://demo-idirectdoc.eazyscripts.com/Api/V2/demo-idirectdoc/Account/Authenticate");
		
		//Build JSON
		JSONObject params = new JSONObject();
		params.put("email", ePrescribeUID);
		params.put("password", ePrescribePWD);
		params.put("platformType", "SERVER");
		params.put("subdomain", ePrescribeSubDomain );
		
		StringEntity postingString = new StringEntity(params.toString());
		
		//Add Headers
		httpPost.addHeader("accept", "text/json");
		httpPost.addHeader("Content-Type", "text/json");
		httpPost.addHeader("ApplicationKey",ePrescribeAppKey);
		httpPost.addHeader("ApplicationSecret",ePrescribeAppSecret);
		
		//Post the request
		httpPost.setEntity(postingString);
		HttpClient  httpClient    = HttpClientBuilder.create().build();
	    HttpResponse postAuthResponse = httpClient.execute(httpPost);
	    
	    /*System.out.println(postAuthResponse.getEntity().toString());

	    //Read the response
	    Header encoding = postAuthResponse.getEntity().getContentEncoding();
	    String encodingStr="UTF-8";;
	    
	    if(encoding!=null)
	    	encodingStr=encoding.getValue();
	    
	    BufferedReader in = new BufferedReader(new InputStreamReader(postAuthResponse.getEntity().getContent(),encodingStr));
	    
	    StringBuilder sb = new StringBuilder();
	    String line ="";
	    // Read response until the end
	    while ((line = in.readLine()) != null) { 
	        sb.append(line); 
	    }

	    String responseJson = sb.toString();
	    System.out.println("responseJson="+ responseJson );
	    JSONObject responseJsonObj = JSONObject.parse(responseJson);*/
	    
	    JSONObject responseAuthJsonObj;
		try {
			responseAuthJsonObj = getHttpResponseJSON(postAuthResponse);
		
		    String loginToken = (String)responseAuthJsonObj.get("token"); //"21-0fa349ec-ad91-4097-b142-1fbf453ec036";
		    System.out.println("loginToken="+ loginToken );
		    
		    
		    //Search for the patient
		    HttpGet httpGet = new HttpGet(ePrescribeUrl+"/Api/Public/V3/"+ePrescribeSubDomain+"/Patients?Search="+patient+"&Skip=0&Take=1&GetAll=true");
		    httpGet.addHeader("accept", "text/json");
		    httpGet.addHeader("Content-Type", "text/json");
		    httpGet.addHeader("ApplicationKey",ePrescribeAppKey);
		    httpGet.addHeader("ApplicationSecret",ePrescribeAppSecret);
		    httpGet.addHeader("Authorization","Bearer "+loginToken);
		    HttpResponse getSearchResponse =httpClient.execute(httpGet);
		    System.out.println("getSearchResponse="+getSearchResponse.toString());
		    JSONObject responseSearchJsonObj = getHttpResponseJSON(getSearchResponse);
		    
		    
		    if(loginToken!=null && !loginToken.isEmpty()){
		    	//response.sendRedirect("https://demo-idirectdoc.eazyscripts.com/API/NewRxAPI.aspx?token="+loginToken+"&patientId="+patient);
		    	if(responseSearchJsonObj!=null && (Long) responseSearchJsonObj.get("total")>0 ){
		    		
		    		//Derive the correctuserid
		    		JSONArray data = (JSONArray)responseSearchJsonObj.get("data");
		    		if(data.size()>0){
		    			JSONObject onePatient = (JSONObject)data.get(0);
		    			patient = (Long)onePatient.get("userId") + "";
		    		}
			    	response.sendRedirect(ePrescribeUrl+"/Api/Public/V3/"+ePrescribeSubDomain+"/Browser/New-Prescription?"
			    			+ "token="+loginToken
			    			+"&patientId="+patient
			    			+"&ApplicationKey="+ePrescribeAppKey
			    			+"&ApplicationSecret="+ePrescribeAppSecret);
		    	}
		    }else
		    	response.getOutputStream().print("Unable to get token. Response was "+ responseAuthJsonObj.toString());
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private JSONObject getHttpResponseJSON(HttpResponse httpResponse) throws Exception{
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
	    JSONObject responseJsonObj = JSONObject.parse(responseJson);
	    return responseJsonObj;
	}
}
