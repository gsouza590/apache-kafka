package com.gabriel.payment_service.service;

import com.gabriel.payment_service.model.Payment;
import com.gabriel.payment_service.resource.PaymentResource;

public interface PaymentService {
    void sendPayment(Payment payment);
}
