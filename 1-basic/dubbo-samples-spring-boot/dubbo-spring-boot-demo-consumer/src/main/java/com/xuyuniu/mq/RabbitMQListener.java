package com.xuyuniu.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: xuyuniu
 **/
@Component
public class RabbitMQListener {
    @RabbitListener(queues = "hello.queue2")
    public void listenSimple(String msg) {
        System.out.println(msg);
    }
}
