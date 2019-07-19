package com.virtustream.emeastatustracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtustream.emeastatustracker.dao.CustomerRepository;
import com.virtustream.emeastatustracker.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository theCustomerRepository) {
		customerRepository = theCustomerRepository;
	}
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(int customerId) {
		Optional<Customer> result = customerRepository.findById(customerId);
		
		Customer theCustomer = null;
		
		if (result.isPresent()) {
			theCustomer = result.get();
		}
		else {
			throw new RuntimeException("Did not find Customer id - " + customerId);
		}
		
		return theCustomer;
	}

	@Override
	public void save(Customer theCustomer) {
		customerRepository.save(theCustomer);
	}

	@Override
	public void deleteById(int theId) {
		customerRepository.deleteById(theId);
	}

	@Override
	public List<Customer> findByStatus(String status) {
		return customerRepository.findByStatus(status);
	}

	@Override
	public List<Customer> findByStatusNot(String status) {
		return customerRepository.findByStatusNot(status);
	}

}
