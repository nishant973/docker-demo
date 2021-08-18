package com.spring.docker.dockerdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.docker.dockerdemo.dto.Customer;
import com.spring.docker.dockerdemo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getCustomers() {
		List<Customer> customers = customerRepository.findAll();
		customers.stream().forEach(System.out::println);
		return customers;
	}
}
