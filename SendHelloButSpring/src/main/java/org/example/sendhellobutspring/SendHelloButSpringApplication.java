package org.example.sendhellobutspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendHelloButSpringApplication {
    private String helloMessage;


    public void setHelloMessage(String message) {
        this.helloMessage = message;
    }

    public void getHelloMessage() {
        System.out.println("Hello message " + helloMessage);
        ;
    }

}
