package com.vaibhus.service;

import java.time.LocalDateTime;
import java.util.List;

import com.vaibhus.entity.Transaction;

public interface TransactionService {
	
	 List<Transaction> getTransactionsByDate(LocalDateTime date);
	 List<Transaction> getAllTransactionsBetweenAmount(int start,int end);
	 List<Transaction> getAllTransactionsByAmount(double amount);
	 Transaction getTransactionById(int txnid) throws Exception;
}
