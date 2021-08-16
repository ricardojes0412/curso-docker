package com.pay.resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pay.domain.Operation;
import com.pay.producer.PayEventProducer;
import com.pay.services.IOperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayResource {

    @Autowired
    private IOperationService service;
    @Autowired
    PayEventProducer eventProducer;
    private Logger log = LoggerFactory.getLogger(PayResource.class);

    @PostMapping("/v1/payevent")
    public ResponseEntity<Operation> postPayEvent(@RequestBody Operation operation) throws JsonProcessingException {
        log.info("antes de transql");
        Operation transql = service.save(operation);
        log.info("despues de transql");
        log.info("antes de sendPayEvent");
        eventProducer.sendPayEvent(transql);
        log.info("despues de sendPayEvent");
        return ResponseEntity.status(HttpStatus.CREATED).body(transql);
    }

}
