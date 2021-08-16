package com.transaction.service;

import com.transaction.entity.Transaction;
import com.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements ITransactionService {

    @Autowired
    TransactionRepository _repository;

    @Override
    public Transaction save(Transaction transaction) {
        // TODO Auto-generated method stub
        return _repository.save(transaction);
    }

    @Override
    public Iterable<Transaction> findByIdInvoice(Integer idInvoice) {
        // TODO Auto-generated method stub
        return _repository.findByIdInvoice(idInvoice);
    }

    @Override
    public Iterable<Transaction> findAll() {
        // TODO Auto-generated method stub
        return _repository.findAll();
    }

}
