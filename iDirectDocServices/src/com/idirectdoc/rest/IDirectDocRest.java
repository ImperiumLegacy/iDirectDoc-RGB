package com.idirectdoc.rest;

import java.util.Iterator;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.idirectdoc.common.RestServiceProperties;


@ApplicationPath("jaxrs")
public class IDirectDocRest extends Application {

	
	public IDirectDocRest() {
		System.out.println("ACMTDRestApplication constructor");
		try {
			RestServiceProperties.init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Could not Initialize RestServiceProperties");
			e.printStackTrace();;
		}
		System.out.println("ACMTDRestApplication constructor");
	
	}
	
	
}