package com.transaction.repository;

import com.transaction.entity.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface TransactionRepository extends MongoRepository<Transaction, String> {

    @Query("{'idInvoice':?0}")
    Iterable<Transaction> findByIdInvoice(Integer idInvoice);
}
