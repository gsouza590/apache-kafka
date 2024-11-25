package com.gabriel.payment_service.service.impl;

import com.gabriel.payment_service.model.Payment;
import com.gabriel.payment_service.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    private final KafkaTemplate<String, Serializable>kafkaTemplate;

    @Override
    @SneakyThrows
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Payment Receive {}", payment);
        Thread.sleep(1000);
        log.info("Enviando Pagamento....");
        kafkaTemplate.send("payment-topic", payment);
    }
}
