package org.example.beanpostprocessor;

public class MessagePreProcessor {
    private String message;

    public String getMessage() {
        return "Message " + message;
    }

    public void setMessage(String message) {
        this.message = message;

    }

    public void beanInit() {
        System.out.println("bean init");
    }

    public void beanDestroy() {
        System.out.println("bean destroy");
    }

}
