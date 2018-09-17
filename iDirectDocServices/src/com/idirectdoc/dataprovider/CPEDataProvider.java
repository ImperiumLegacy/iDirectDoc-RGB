package com.idirectdoc.dataprovider;

import java.util.logging.Logger;

import com.filenet.api.collection.IndependentObjectSet;
import com.filenet.api.core.Connection;
import com.filenet.api.core.Domain;
import com.filenet.api.core.Factory;
import com.filenet.api.core.ObjectStore;
import com.filenet.api.query.SearchSQL;
import com.filenet.api.query.SearchScope;

public class CPEDataProvider {
	Logger logger =null;
	String objectStoreName ="";
	ObjectStore objectStore;
	Connection connection = null;
	Domain p8Domain = null;
			
	String currentOSName;
	String connectURI;
	String userName;
	String password;
	String domainName;
	
	public static final  String PROP_CPE_URL= "CPE_URL";
	
	public CPEDataProvider() {
		logger = Logger.getLogger(CPEDataProvider.class.getName());
	}
	
	private String getCurrentOSName() {
		return currentOSName;
	}
	public void setCurrentOSName(String currentOSName) {
		this.currentOSName = currentOSName;
	}
	public String getConnectURI() {
		return connectURI;
	}

	public void setConnectURI(String connectURI) {
		this.connectURI = connectURI;
	}

	public String getDomain() {
		return domainName;
	}

	public void setDomain(String domainname) {
		this.domainName = domainname;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPasssword() {
		return password;
	}

	public void setPasssword(String passsword) {
		this.password = passsword;
	}


	/**
	 * Searches the Objectstore with the sqlquery and return the set of the objects 
	 *
	 * @param sqlQuery SQLquery to search the OS
	 * @param osName accepts the Objectstorename as input
	 * @return the set of the objects
	 */
	public IndependentObjectSet executeSearch(String sqlQuery,String osName) throws Exception{

		logger.fine("SQL received: "+ sqlQuery);
		IndependentObjectSet  ioSet = null;
		SearchScope searchScope = null;
		ObjectStore os = fetchObjectStore(osName);
		try{ 
			if(searchScope == null){
				searchScope = new SearchScope(os);
			} 	
			SearchSQL sqlObject = new SearchSQL(sqlQuery);
			ioSet = searchScope.fetchObjects(sqlObject, 50, null, new Boolean(true));
		}catch(Exception e){
			throw e;
		}
		return ioSet;

	}
	
	private Connection getConnection(){
		if (connectURI == null || connectURI.length() == 0)
			throw new RuntimeException("P8 Connection URI is  not specified");

		if (connection == null){
			connection = Factory.Connection.getConnection(connectURI);
		}
		return connection;
	}

	private Domain getP8Domain(){
		if (p8Domain ==null){
			p8Domain = Factory.Domain.fetchInstance(getConnection(), domainName, null);	
		}
		return p8Domain;
	}
	private ObjectStore fetchObjectStore(String osName) {
		if (osName == null || osName.length() == 0)
			throw new RuntimeException("P8 Object Store is  not specified");

		ObjectStore os = Factory.ObjectStore.fetchInstance(getP8Domain(), osName, null);

		return os;
	}
	
}
