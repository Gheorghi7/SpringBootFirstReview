package org.example.eventhandling;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyEventRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my-event-config.xml");
        MyEventPublisher myEventRunner = (MyEventPublisher) context.getBean("myEventPublisher");
        myEventRunner.publishEvent();

    }
}
