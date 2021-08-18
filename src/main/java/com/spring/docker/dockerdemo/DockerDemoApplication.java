package com.spring.docker.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.spring.docker.dockerdemo.repository.CustomerRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = CustomerRepository.class)
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
