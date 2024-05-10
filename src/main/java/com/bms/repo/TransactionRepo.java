package com.bms.repo;

import java.util.List;

import com.bms.entity.Payee;
import com.bms.entity.Transaction;


public interface TransactionRepo{

	public void deleteByPayee(Payee Payee);
	public void addTransaction(Transaction transaction);
	public List<Transaction> findAllTransaction();
	
}
