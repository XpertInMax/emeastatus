package com.virtustream.emeastatustracker.dao;

import com.virtustream.emeastatustracker.entity.Customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
	
	public List<Customer> findByStatus(String status);
	public List<Customer> findByStatusNot(String status);

}
