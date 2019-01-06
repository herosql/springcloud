package com.sqlhero.logservice.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;


///**
// * Created by fangzhipeng on 2017/7/12.
// */
//@Component
//public class Sender {
//
//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//
//    public void send() {
//        String context = "hello " + new Date();
//        System.out.println("Sender : " + context);
//        rabbitTemplate.convertAndSend(RabbitConfig.queueName, "Hello from RabbitMQ!");
//    }
//
//}