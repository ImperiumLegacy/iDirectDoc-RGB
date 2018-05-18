package com.idirectdoc.servlets;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.WebApplicationException;
import javax.xml.ws.Holder;

import com.mdtoolboxrx.Account;
import com.mdtoolboxrx.AllergyRecord;
import com.mdtoolboxrx.ArrayOfAllergyRecord;
import com.mdtoolboxrx.ArrayOfLocation;
import com.mdtoolboxrx.ArrayOfPrescriber;
import com.mdtoolboxrx.Location;
import com.mdtoolboxrx.Patient;
import com.mdtoolboxrx.Prescriber;
import com.mdtoolboxrx.RxSoapProxy;
import com.mdtoolboxrx.Status;

/**
 * Servlet implementation class iPrescribe
 */
@WebServlet(
		urlPatterns = { "/iPrescribe" }, 
		initParams = { 
				@WebInitParam(name = "AssignedAccount", value = "5233"), 
				@WebInitParam(name = "AssingedAccountKey", value = "RB3H-WTY3-G98M-A66E-T5BQ"), 
				@WebInitParam(name = "WebServiceURL", value = "https://test.mdtoolboxrx.net/rxws/rx.asmx"), 
				@WebInitParam(name = "WebPageURL", value = "https://test.mdtoolboxrx.net/rxtest/access1.aspx")
		})
public class iPrescribe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public iPrescribe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int assingedAccount = Integer.parseInt(this.getInitParameter("AssignedAccount"));
		String assingedAccountKey = this.getInitParameter("AssingedAccountKey");
		String webServiceUrl = this.getInitParameter("WebServiceURL");
		String webPageUrl = this.getInitParameter("WebPageURL");
		
		String authCode = "";
		try {
			authCode = callMDToolbox(webServiceUrl, assingedAccount, assingedAccountKey);	
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath()).append("status :").append(status);

        //build the query string with details needed by the rx writer
        String qs = "?code=" + authCode;

        //pass the acct id + subaccount/practice id and current user (as authenticated by your system)
        // this is hard coded for demo purposes
        qs += "&aid="+assingedAccount+"&sid=99&user=johns" ;


        //pass in special theme colors to match up your application if desired
        qs += "&theme=blue";

        //doctor writing the rx - pass your unique id for the doctor that has been pre-loaded
        qs += "&did=123";

        //location (default location) prescriber will prescribe from
        qs += "&lid=1";

        //we want to show the rx summary/prescription writer page when it opens
        qs += "&page=rx";

        //patient who will be loaded in the rx writer 
        qs += "&pid=4";

        webPageUrl=webPageUrl+qs;
        System.out.println(webPageUrl);
        
		response.sendRedirect(webPageUrl);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private String callMDToolbox(String url, int account, String accountKey) throws Exception{
		RxSoapProxy rsp = new RxSoapProxy();
		rsp._getDescriptor().setEndpoint(url);
		
		        //need to include patient data here
        Patient patientObj = new Patient();
        patientObj.setID("4");
        patientObj.setFirstName("Jane");
        patientObj.setLastName("Smith");
        patientObj.setGender("F");
        patientObj.setDOB(Calendar.getInstance());
        
        //account passed in for authenticating E.H.R. partner and their practice/clinic
        Account accountObj = new Account();
        accountObj.setAccountId(account);
        accountObj.setAccountAuthKey(accountKey);
        accountObj.setPracticeId("99");   // current practice using system (pass your unique id)
        accountObj.setPracticeName("iDirect Doc");
        accountObj.setUserId("99");   //current user logged in to E.H.R.
        accountObj.setUserName("johns");
        
        ArrayOfPrescriber prescribers = new ArrayOfPrescriber();
        ArrayOfLocation locations = new ArrayOfLocation();
        ArrayOfAllergyRecord allergies= new ArrayOfAllergyRecord ();
        
        // set prescriber(s) that can prescribe from this practice and their location(s)
        Prescriber p = new Prescriber();              
        p.setID("1");
        p.setFirstName("John");
        p.setLastName("Smith");
        p.setDEA("BT6612345");
        p.setNPI("1234567890");
        p.setAddr2("");
        p.setEmail("prescriber@example.com");
        p.setLocationID("1");
        p.setCurrent(true);
        
        Location l = new Location();
        l.setID("1");
        l.setAddr1("1234 Main AVE");
        l.setAddr2("");
        l.setCity("Richmond");
        l.setState("CA");
        l.setZip("88354");
        l.setClinicName("Primary Care");
        l.setPhone("2095151234");
        l.setFax("2095151245");
        l.setCurrent(true);
        
        //  pass any additional data about this patient that MD Toolbox can use for e-prescribing
        AllergyRecord ar = new AllergyRecord();
        ar.setAllergyId(10);
        ar.setAllergyName("Cat Allergy");
        ar.setSeverityLevel(3);
        
        
        prescribers.getPrescriber().add(p);
        locations.getLocation().add(l);
        allergies.getAllergyRecord().add(ar);
        
        Calendar eligCheckEncounterDate = Calendar.getInstance();
        Holder<String > result = new Holder<String>();
        Holder<Status > statusFlag = new Holder<Status>();
        Holder<String > statusMsg = new Holder<String>();
        
        //StatusHolder statusFlag = new StatusHolder();
        //StringHolder statusMsg = new StringHolder();
        
        rsp.updateDataForScreens(prescribers, locations, patientObj, 
                        null, allergies, null, null, false, 
                        eligCheckEncounterDate, null, 
                        accountObj, result, 
                        statusFlag, statusMsg);

        if(statusFlag.value==Status.SUCCESS)
        	return result.value;
        else
        	throw new Exception("Authentication Error: "+statusMsg.value);
        
        //return statusFlag.value.toString();
        // next we would use the return value and open up the MD Toolbox URL to do e-Prescribing – Check if statusFlag == Success – if Success open URL, if NOT then show alert to end user alert(statusMsg)

	}

}
