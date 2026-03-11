package org.example.eventhandling1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("message-event.xml");
        context.start();
        Message message = (Message) context.getBean("message");
        System.out.println(message.getMessage());
        context.stop();
    }
}
