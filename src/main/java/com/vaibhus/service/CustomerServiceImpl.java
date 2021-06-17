package com.vaibhus.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vaibhus.dao.CustomerRepository;
import com.vaibhus.entity.Customer;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customer_repository;

	@Override
	public Customer insertCustomer(Customer customer) {
		return customer_repository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customer_repository.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return customer_repository.save(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		customer_repository.deleteById(id);
		
	}

	@Override
	public List<Customer> getAllCustomersByAmount(double amount) {
		return customer_repository.getAllCustomersByAmount(amount);
	}

}