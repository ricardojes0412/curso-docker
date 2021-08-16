package com.invoice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.invoice.entity.Invoice;
import com.invoice.entity.Operation;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationEvents {
    private Logger log = LoggerFactory.getLogger(OperationEvents.class);

    @Autowired
    private InvoiceService _invoiceService;
    @Autowired
    private ObjectMapper objectMapper;


    public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
        Operation operation = objectMapper.readValue(consumerRecord.value(), Operation.class);
        Invoice invoice = _invoiceService.findById(operation.getIdInvoice());
        invoice.setState(1);
        log.info("Actulizando Factura Pagada ***" + operation.getIdInvoice());
        _invoiceService.save(invoice);
    }
}
