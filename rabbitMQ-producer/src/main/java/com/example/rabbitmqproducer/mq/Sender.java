package com.example.rabbitmqproducer.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: luoJunChong
 * @Date: 2021/6/6 10:03
 * description:发送消息
 */
@Component
public class Sender {

    /**
     * 通过注入的这个类来传递消息
     */
    private final AmqpTemplate rabbitTemplate;

    public Sender(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(String value) {
        String context = "hello" + new Date()+ "--result:" + value;
        System.out.println("Sender :" + context);
        //hello为创建的队列名,context为发送的消息
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}