package com.idirectdoc.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class CORSFilter implements ContainerResponseFilter {
	
	@Override
	public void filter(ContainerRequestContext creq, ContainerResponseContext cresp) throws IOException {
		cresp.getHeaders().add("Access-Control-Allow-Origin", "*");
		cresp.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        cresp.getHeaders().add("Access-Control-Allow-Credentials", "true");
        cresp.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD");
        cresp.getHeaders().add("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With");
		
	}
}