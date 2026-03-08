package org.example.inheritance;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageInheritanceRunner {
    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "inheritance-message-config.xml");

        Message message = (Message) applicationContext.getBean("message");
        System.out.println(message.getMessage());
        System.out.println("-----------------------------------");
        MessageToYou messageToYou = (MessageToYou) applicationContext.getBean("messageToYou");
        System.out.println("Second Bean");
        System.out.println(messageToYou.getMessage());
        System.out.println(messageToYou.getMessageToYou());

    }

}
