package org.example.sendmessage;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.beans.BeanProperty;
import java.beans.JavaBean;

public class Message {
    private String message;

    public String getMessage() {
        return "Message " + message;
    }

    public void setMessage(String message) {
        this.message = message;

    }

}
