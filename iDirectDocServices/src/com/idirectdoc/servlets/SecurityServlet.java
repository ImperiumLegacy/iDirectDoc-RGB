package com.idirectdoc.servlets;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.ModificationItem;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecurityServlet
 */
@WebServlet(
		description = "Password Resets and Image Updates", 
		urlPatterns = { "/SecurityServlet" }, 
		initParams = { 
				@WebInitParam(name = "LDAPServerUrl", value = "ldaps://ecmdemo1.ecm.ibm.local:636"), 
				@WebInitParam(name = "CertStore", value = "C:/IBM/WebSphere/AppServer/java_1.8_64/jre/lib/security/cacerts")
		})
public class SecurityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecurityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Hashtable env = new Hashtable();
        String userName = request.getParameter("username");
        String oldPassword = request.getParameter("oldpassword");
        String newPassword = request.getParameter("newpassword");
        
        //Access the keystore, this is where the Root CA public key cert was installed
        //Could also do this via command line java -Djavax.net.ssl.trustStore....
        String keystore = this.getInitParameter("CertStore");
        System.setProperty("javax.net.ssl.trustStore",keystore);
        // Password of your java keystore. Default value is : changeit
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        
        env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");

        //set security credentials, note using simple cleartext authentication
        env.put(Context.SECURITY_AUTHENTICATION,"simple");
        env.put(Context.SECURITY_PRINCIPAL,"CN=p8demo,CN=Users,DC=ecm,DC=ibm,DC=local");//userName);
        env.put(Context.SECURITY_CREDENTIALS,"Demo4you!");//oldPassword);

        //connect to my domain controller
        String ldapURL = getInitParameter("LDAPServerUrl");
        env.put(Context.PROVIDER_URL,ldapURL);
        
        //specify use of ssl
        if(ldapURL.startsWith("ldaps"))
        	env.put(Context.SECURITY_PROTOCOL,"ssl");
        
        try {

             // Create the initial directory context
             LdapContext ctx = new InitialLdapContext(env,null);
       
             //change password is a single ldap modify operation
             //that deletes the old password and adds the new password
             ModificationItem[] mods = new ModificationItem[1];
        

             //Firstly delete the "unicdodePwd" attribute, using the old password
             //Then add the new password,Passwords must be both Unicode and a quoted string
             String oldQuotedPassword = "\"" + oldPassword + "\"";
             byte[] oldUnicodePassword = oldQuotedPassword.getBytes("UTF-16LE");
             String newQuotedPassword = "\"" + newPassword + "\"";
             //byte[] newUnicodePassword = newQuotedPassword.getBytes("UTF-16LE");
             byte[] newUnicodePassword = Base64.getEncoder().encode (newQuotedPassword.getBytes("UTF-16LE"));
             
             mods[0] = new ModificationItem(DirContext.REPLACE_ATTRIBUTE, new BasicAttribute("unicodePwd", newUnicodePassword));
             //mods[1] = new ModificationItem(DirContext.ADD_ATTRIBUTE, new BasicAttribute("unicodePwd", newUnicodePassword));
             String[] attrNames  = {"photo"}; 
             Attributes attrs = ctx.getAttributes(userName,attrNames);
             // Perform the update
             ctx.modifyAttributes(userName, mods);
        
             System.out.println("Changed Password for: " + userName);     
             ctx.close();

        } 
        catch (NamingException e) {
        	e.printStackTrace();
            throw new ServletException("Problem changing password: " +e.getMessage() , e);
        }
        catch (UnsupportedEncodingException e) {
        	e.printStackTrace();
        	throw new ServletException("Problem encoding password: " +e.getMessage() , e);

        }

	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
