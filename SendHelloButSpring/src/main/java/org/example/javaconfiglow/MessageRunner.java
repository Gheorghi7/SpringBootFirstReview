package org.example.javaconfiglow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageRunner {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);

        Message message = context.getBean(Message.class);
        message.setMessage("Hello World!");
        System.out.println(message);
    }
}
