package com.example.rabbitmqconsumer.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: luoJunChong
 * @Date: 2021/6/6 0:28
 * description:监听hello队列
 */
@Component
@RabbitListener(queues = "hello")
public class Receive {

    /**
     * 处理接受到的消息
     *
     * @param hello
     */
    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver:"+hello);
    }
}