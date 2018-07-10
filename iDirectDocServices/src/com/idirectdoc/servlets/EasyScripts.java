package com.idirectdoc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.ibm.json.java.JSONObject;

/**
 * Servlet implementation class EasyScripts
 */
@WebServlet(name = "EasyScripts", description = "Easy Scripts Prescription Page", urlPatterns = { "/EasyScripts" }, loadOnStartup=1)
public class EasyScripts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EasyScripts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestor = request.getParameter("Requestor");
		String patient = request.getParameter("Patient");
		
		JSONObject params = new JSONObject();
		HttpPost httpPost = new HttpPost("https://demo-idirectdoc.eazyscripts.com/Api/Public/V3/demo-idirectdoc/Account/Authenticate");
		params.put("email", requestor);
		params.put("password", "idirectdoc");
		params.put("platformType", "WEB");
		params.put("subdomain", "demo-idirectdoc");
		params.put("password", "idirectdoc");
		
		StringEntity postingString = new StringEntity(params.toString());
				
		httpPost.addHeader("content-type", "application/json");
		httpPost.setEntity(postingString);
		HttpClient  httpClient    = HttpClientBuilder.create().build();
	    HttpResponse postResponse = httpClient.execute(httpPost);
	    
	    System.out.println(postResponse.getEntity().toString());
	    
	    response.sendRedirect("https://demo-idirectdoc.eazyscripts.com /app/patients/"+patient+"/prescription/new");
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
