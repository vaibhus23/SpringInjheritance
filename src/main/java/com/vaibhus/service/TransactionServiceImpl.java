package com.vaibhus.service;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vaibhus.dao.TransactionRepository;
import com.vaibhus.entity.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transaction_repository;

	
	@Override
	public Transaction getTransactionById(int txnid) throws Exception {
		
		return transaction_repository.findById(txnid).orElseThrow(()->new Exception("Element not found"));
	}

	@Override
	public List<Transaction> getTransactionsByDate(LocalDateTime date) {

		//return transaction_repository.findAllByTransactionDate(date);
		return null;
	}

	@Override
	public List<Transaction> getAllTransactionsBetweenAmount(int start, int end) {

		//return transaction_repository.findAllTransactionsBetweenAmount(start, end);
		return null;
	}

	@Override
	public List<Transaction> getAllTransactionsByAmount(double amount) {
		// TODO Auto-generated method stub
		//return transaction_repository.findAllTransactionsByAmount(amount);
		return null;
	}

}