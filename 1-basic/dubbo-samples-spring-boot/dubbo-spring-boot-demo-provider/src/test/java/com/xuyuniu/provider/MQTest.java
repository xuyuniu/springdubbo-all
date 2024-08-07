package com.xuyuniu.provider;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: xuyuniu
 **/
@SpringBootTest
public class MQTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test() {
        String queueName = "hello.queue2";
        String msg = "hello, msdsag";
        rabbitTemplate.convertAndSend(queueName, msg);
    }


}
