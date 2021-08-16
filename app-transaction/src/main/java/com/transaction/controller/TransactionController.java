package com.transaction.controller;

import com.transaction.entity.Transaction;
import com.transaction.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TransactionController {

    @Autowired
    ITransactionService _transaction;

    @GetMapping("listar")
    public List<Transaction> listar() {
        return (List<Transaction>) _transaction.findAll();
    }

    @GetMapping("/transaction/{idInvoice}")
    public ResponseEntity<?> getByAccountId(@PathVariable Integer idInvoice) {
        Iterable<Transaction> transaction = _transaction.findByIdInvoice(idInvoice);
        return ResponseEntity.ok(transaction);
    }
}