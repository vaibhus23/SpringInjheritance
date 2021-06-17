package com.vaibhus.service;

import java.util.List;

import com.vaibhus.entity.Customer;

public interface CustomerService {
	Customer insertCustomer(Customer customer);
	List<Customer> getAllCustomers();
	Customer updateCustomer(Customer customer);
	void deleteCustomer(int customerId);
	List<Customer> getAllCustomersByAmount(double amount);
}
