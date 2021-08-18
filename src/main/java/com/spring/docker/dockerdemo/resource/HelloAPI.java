package com.spring.docker.dockerdemo.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("docker-demo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HelloAPI {

	@Path("/heathcheck")
	@GET
	public Response hello() {
		return Response.ok().entity("jvm is healthy!").build();
	}
	
}
