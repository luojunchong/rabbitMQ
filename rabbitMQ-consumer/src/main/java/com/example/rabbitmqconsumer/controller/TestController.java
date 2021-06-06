package com.example.rabbitmqconsumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: luoJunChong
 * @Date: 2021/6/6 0:04
 * description:测试部署成功，勿删
 */
@Controller
@RequestMapping("/index")
public class TestController {

    @ResponseBody
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
