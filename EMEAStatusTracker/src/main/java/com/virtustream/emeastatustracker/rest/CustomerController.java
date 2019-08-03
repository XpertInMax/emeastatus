package com.virtustream.emeastatustracker.rest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtustream.emeastatustracker.entity.Customer;
import com.virtustream.emeastatustracker.service.CustomerService;

@Controller
public class CustomerController {

	private CustomerService customerService;

	public CustomerController(CustomerService theCustomerService) {
		customerService = theCustomerService;
	}

	// add mapping for "/list"
	
	@GetMapping("/")
	public String list(Model theModel) {

		// get customers from db
		List<Customer> theCustomers = customerService.findByStatusNot("Complete");

		// add to the spring model
		theModel.addAttribute("customers", theCustomers);

		return "customers/list-customers";
	}

	@GetMapping("/list")
	public String listCustomers(Model theModel) {

		// get customers from db
		List<Customer> theCustomers = customerService.findByStatusNot("Complete");

		// add to the spring model
		theModel.addAttribute("customers", theCustomers);

		return "customers/list-customers";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Customer theCustomer = new Customer();

		theModel.addAttribute("customer", theCustomer);

		return "customers/customer-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {

		// get the employee from the service
		Customer theCustomer = customerService.findById(theId);

		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("customer", theCustomer);

		// send over to our form
		return "customers/customer-form";
	}

	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {

		// save the employee
		customerService.save(theCustomer);

		// use a redirect to prevent duplicate submissions
		return "redirect:/list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("customerId") int theId) {

		// delete the employee
		customerService.deleteById(theId);

		// redirect to /customers/list
		return "redirect:/list";

	}
	
	@GetMapping("/listComplete")
	public String listCompleteCustomers(Model theModel) {

		// get customers from db
		List<Customer> theCustomers = customerService.findByStatus("Complete");

		// add to the spring model
		theModel.addAttribute("customers", theCustomers);

		return "customers/list-customers";
	}
}
