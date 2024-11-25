package com.gabriel.string_consumer.listeners;

import com.gabriel.string_consumer.custom.StrConsumerCustomListner;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @SneakyThrows
    @StrConsumerCustomListner(groupId = "group-1")
    public void create(String message){
       log.info("CREATE::: Receiver message{}",message);
        throw new IllegalArgumentException("Exception...");
    }

    @StrConsumerCustomListner(groupId = "group-1")
    public void log(String message){
        log.info("LOG:::Receiver message{}",message);
    }

    @KafkaListener(groupId = "group-2", topics = "str-topic",containerFactory = "validMessageContainerFactory")
    public void history(String message){
        log.info("HISTORY:::Receiver message{}",message);
    }
}
