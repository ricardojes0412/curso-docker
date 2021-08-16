package com.invoice.controller;

import com.invoice.entity.Invoice;
import com.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService _service;

    @GetMapping("listar")
    public List<Invoice> listar() {
        return _service.findAll();
    }

    @GetMapping("/ver/{id}")
    public Invoice detalle(@PathVariable Integer id) {
        return _service.findById(id);
    }
}
