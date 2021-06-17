package com.vaibhus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vaibhus.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query(value = "Select * from Customer1 c where c.customerid in (select customerid from transaction where txnamount = ?1)",nativeQuery = true)
	List<Customer> getAllCustomersByAmount(double amount);
}
