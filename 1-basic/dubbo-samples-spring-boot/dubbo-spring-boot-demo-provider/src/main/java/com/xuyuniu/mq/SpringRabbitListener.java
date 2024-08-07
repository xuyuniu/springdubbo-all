package com.xuyuniu.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: xuyuniu
 **/
@Component
public class SpringRabbitListener {

    @RabbitListener(queues = "hello.queue2")
    public void listenSimple(String msg) {
        System.out.println(msg);
    }
}
