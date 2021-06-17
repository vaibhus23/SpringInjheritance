package com.vaibhus;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhus.entity.Transaction;
import com.vaibhus.service.TransactionServiceImpl;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionServiceImpl transaction_service;
	
	@GetMapping("/{txnid}")
	public Transaction getTransactionById(@PathVariable int txnid) throws Exception {
		return transaction_service.getTransactionById(txnid);
	}
	
	@GetMapping("byDate/{date}")
	public List<Transaction> getTransactionsByDate(@PathVariable LocalDateTime date){
		return transaction_service.getTransactionsByDate(date);
	}
	
	@GetMapping("byDate/{date},")
	public List<Transaction> getAllTransactionsBetweenAmount(int start, int end){
		return transaction_service.getAllTransactionsBetweenAmount(start, end);
		
	}
	
	@GetMapping("byAmount/{amount}")
	public List<Transaction> getAllTransactionsByAmount(@PathVariable double amount) {
		return transaction_service.getAllTransactionsByAmount(amount);
		
	}
}
