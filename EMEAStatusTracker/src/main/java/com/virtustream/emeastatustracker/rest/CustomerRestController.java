package com.virtustream.emeastatustracker.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtustream.emeastatustracker.entity.Customer;
import com.virtustream.emeastatustracker.service.CustomerService;

@RestController
@RequestMapping("/restcustomer")
public class CustomerRestController {

	private CustomerService customerService;

	@Autowired
	public CustomerRestController(CustomerService theCustomerService) {
		customerService = theCustomerService;
	}

	// expose "/customers" and return list of Customers
	@GetMapping("/customers")
	public List<Customer> findAll() {
		return customerService.findAll();
	}

	// add mapping for GET /Customers/{CustomerId}

	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {

		Customer theCustomer = customerService.findById(customerId);
		
		return theCustomer;
		
	}

	// add mapping for POST /Customers - add new Customer

	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer theCustomer) {

		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update

		theCustomer.setId(0);

		customerService.save(theCustomer);

		return theCustomer;
	}

	// add mapping for PUT /customers - update existing Customer

	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer) {

		customerService.save(theCustomer);

		return theCustomer;
	}

	// add mapping for DELETE /Customers/{CustomerId} - delete Customer

	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {

		
		customerService.deleteById(customerId);

		return "Deleted Customer id - " + customerId;
	}

}
