package com.gabriel.payment_service.resource.impl;

import com.gabriel.payment_service.model.Payment;
import com.gabriel.payment_service.resource.PaymentResource;
import com.gabriel.payment_service.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payments")
public class PaymentResourceImpl implements PaymentResource {

    private final PaymentService paymentService;

    @Override
    @PostMapping
    public ResponseEntity<Payment> payment(@RequestBody Payment payment) {
        paymentService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(payment);
    }
}
