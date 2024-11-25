package com.gabriel.payment_service.service.impl;

import com.gabriel.payment_service.model.Payment;
import com.gabriel.payment_service.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Payment Receive", payment);
    }
}
