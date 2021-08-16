package com.invoice.service;

import com.invoice.entity.Invoice;
import com.invoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceService;

    @Override
    public List<Invoice> findAll() {
        return (List<Invoice>) invoiceService.findAll();
    }

    @Override
    public Invoice findById(Integer id) {
        return invoiceService.findById(id).orElse(null);
    }

    @Override
    public Invoice save(Invoice invoice) {
        return invoiceService.save(invoice);
    }
}
