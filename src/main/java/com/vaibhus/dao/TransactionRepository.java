package com.vaibhus.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaibhus.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	
	
	/*List<Transaction> findAllByTransactionDate(LocalDateTime date);
	List<Transaction> findAllTransactionsBetweenAmount(int start, int end);
	List<Transaction> findAllTransactionsByAmount(double amount);*/

}
