package com.sk.jms.sender;

import com.sk.jms.config.JmsConfig;
import com.sk.jms.model.HelloWorldMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class HelloSender {


    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 2000)
    public void sendMessage() {

        log.info("Sending out message to Queue");
        var msg = HelloWorldMessage
                .builder()
                .id(UUID.randomUUID())
                .message("Mesaage send from Hello Sender")
                .build();

        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE,msg);
    }
}
