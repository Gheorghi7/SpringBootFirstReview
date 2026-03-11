package org.example.eventhandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;


public class EventStartHandling implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("EventStartHandling");
    }


}
