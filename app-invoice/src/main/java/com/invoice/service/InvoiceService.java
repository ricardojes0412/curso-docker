package com.invoice.service;

import com.invoice.entity.Invoice;

import java.util.List;

public interface InvoiceService {

    List<Invoice> findAll();

    Invoice findById(Integer id);

    Invoice save(Invoice account);

}
