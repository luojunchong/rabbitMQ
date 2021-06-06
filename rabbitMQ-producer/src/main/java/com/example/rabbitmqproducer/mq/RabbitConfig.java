package com.example.rabbitmqproducer.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: luoJunChong
 * @Date: 2021/6/6 10:03
 * description:Rabbit配置类
 */

@Configuration
public class RabbitConfig {
    public final static String QUEUE_NAME = "hello";

    @Bean
    public Queue helloQueue() {
        return new Queue(QUEUE_NAME);
    }

}