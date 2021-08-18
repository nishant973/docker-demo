package com.spring.docker.dockerdemo.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.docker.dockerdemo.service.CustomerService;

@Path("customer-data")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerAPI {
	
	@Autowired
	private CustomerService customerService;

	@Path("/customers")
	@GET
	public Response customer() {
		return Response.ok().entity(customerService.getCustomers()).build();
	}
}
