package com.example.rabbitmqproducer.controller;

import com.example.rabbitmqproducer.service.RabbitMqService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: luoJunChong
 * @Date: 2021/6/6 0:04
 * description:
 */
@Controller
@RequestMapping("/producer")
public class RabbitMqController {
    @Resource
    private RabbitMqService rabbitMqService;

    @ResponseBody
    @RequestMapping("/sender")
    public String sender(String value) {
        rabbitMqService.senderService(value);
        return "sender";
    }
}
