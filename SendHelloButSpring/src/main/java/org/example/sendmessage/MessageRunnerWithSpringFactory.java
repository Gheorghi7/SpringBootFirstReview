package org.example.sendmessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MessageRunnerWithSpringFactory {

    public static void main(String[] args) {
       ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:message-beans.xml");

       Message firstMessage = (Message) applicationContext.getBean("beanMessage");
       firstMessage.setMessage("firstMessage");
        System.out.println(firstMessage.getMessage());
        Message secondMessage = (Message) applicationContext.getBean("beanMessage");
        System.out.println(secondMessage.getMessage());

    }
}

