package com.example.rabbitmqproducer.service.impl;

import com.example.rabbitmqproducer.mq.Sender;
import com.example.rabbitmqproducer.service.RabbitMqService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: luoJunChong
 * @Date: 2021/6/6 0:29
 * description:
 */
@Service
public class RabbitMqServiceImpl implements RabbitMqService {

    @Resource
    private Sender sender;

    @Override
    public void senderService(String value) {
        sender.send(value);
    }
}
