package com.spring.docker.dockerdemo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.spring.docker.dockerdemo.resource.CustomerAPI;
import com.spring.docker.dockerdemo.resource.HelloAPI;

@Component
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		register(HelloAPI.class);
		register(CustomerAPI.class);
	}
}
