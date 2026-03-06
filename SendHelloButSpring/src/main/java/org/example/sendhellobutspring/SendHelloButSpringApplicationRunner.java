package org.example.sendhellobutspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SendHelloButSpringApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        SendHelloButSpringApplication app = (SendHelloButSpringApplication) context.getBean("springHelloWorld");
        app.getHelloMessage();
    }
}
