package org.example.beanpostprocessor;

import org.example.sendmessage.Message;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageWithBeanProccessorRunner {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("message-beans.xml");

        MessagePreProcessor message = (MessagePreProcessor) applicationContext.getBean("beanMessage");
        message.setMessage("message");
        System.out.println(message.getMessage());
        applicationContext.registerShutdownHook();

    }
}

