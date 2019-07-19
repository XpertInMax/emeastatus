package com.virtustream.emeastatustracker.service;

import java.util.List;

import com.virtustream.emeastatustracker.entity.Customer;

public interface CustomerService {
	
	public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public void save(Customer theCustomer);
	
	public void deleteById(int theId);
	
	public List<Customer> findByStatus(String status);
	
	public List<Customer> findByStatusNot(String status);
}
