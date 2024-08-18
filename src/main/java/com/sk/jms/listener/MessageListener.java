package com.sk.jms.listener;

import com.sk.jms.config.JmsConfig;
import com.sk.jms.model.HelloWorldMessage;
import jakarta.jms.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.messaging.MessageHeaders;

@Component
@Slf4j
public class MessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage hellomsg, @Headers MessageHeaders headers, Message msg){

            log.info("Got the message!");
            log.info("jms message:  " + hellomsg);
            log.info("MessageHeaders: " + headers);
            log.info("Java Message: " + msg);

    }

}
