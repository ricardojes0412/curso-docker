package com.transaction.service;


import com.transaction.entity.Transaction;

public interface ITransactionService {
	 Transaction save (Transaction transaction);
	 Iterable<Transaction> findByIdInvoice(Integer accountId);
	 Iterable <Transaction> findAll();
}
