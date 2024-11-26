package com.gabriel.payment_service.service;

import com.gabriel.payment_service.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
