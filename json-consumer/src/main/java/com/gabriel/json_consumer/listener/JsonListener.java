package com.gabriel.json_consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.gabriel.json_consumer.model.Payment;

import lombok.extern.log4j.Log4j2;


@Component
@Log4j2
public class JsonListener {

    @KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
    public void antiFraud(@Payload Payment payment) {
        try {
            log.info("Payment received {}", payment);
            Thread.sleep(2000);
            log.info("Validating Fraud...");
            Thread.sleep(2000);
            log.info("Purchase approved");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            log.error("Error processing antiFraud listener: {}", e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    @KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
    public void pdfGenerator(@Payload Payment payment) {
        try {
            log.info("Generating PDF for product id {}", payment.getId());
            Thread.sleep(2000);
            log.info("PDF Generated");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            log.error("Error processing pdfGenerator listener: {}", e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    @KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
    public void sendEmail(@Payload Payment payment) {
        try {
            log.info("Sending Email for product id {}", payment.getId());
            Thread.sleep(2000);
            log.info("Email sent");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            log.error("Error processing sendEmail listener: {}", e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
