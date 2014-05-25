package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status {
	private static final String api_version="0.002";
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java Web Services</p>";
		
	}
	@Path("/version")
	@GET
		@Produces(MediaType.TEXT_HTML)
		public String returnVersion(){
			return "<p>version</p>"+api_version;
			
		}

}
