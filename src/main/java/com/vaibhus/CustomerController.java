package com.vaibhus;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhus.entity.Customer;
import com.vaibhus.service.CustomerService;
import com.vaibhus.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customer_service;
	
	@PostMapping("/add")
	public ResponseEntity<Customer>  insertCustomer(@RequestBody Customer customer) {
		Customer customer1=customer_service.insertCustomer(customer);
		return new ResponseEntity<Customer>(customer1,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> list= customer_service.getAllCustomers();
		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		Customer customer2=customer_service.updateCustomer(customer);
		return new ResponseEntity<Customer>(customer2,HttpStatus.OK);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customer_service.deleteCustomer(id);
	}
	
	@GetMapping("/getByAmount/{amount}")
	public List<Customer> getAllCustomersByAmount(@PathVariable double amount) {
		return customer_service.getAllCustomersByAmount(amount);
	}
	
}