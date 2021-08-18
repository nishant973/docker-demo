package com.spring.docker.dockerdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.docker.dockerdemo.dto.Customer;



public interface CustomerRepository extends MongoRepository<Customer, Integer> {

	
}
