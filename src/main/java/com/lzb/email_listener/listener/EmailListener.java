package com.lzb.email_listener.listener;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues="mv_email")
public class EmailListener {

    @RabbitHandler
    public void getEmail(Map map){
        System.out.println("直接模式消费消息"+map);
    }
}
