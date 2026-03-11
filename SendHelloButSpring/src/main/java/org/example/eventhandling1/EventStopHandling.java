package org.example.eventhandling1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EventStopHandling implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("EventStopHandling");
    }
}
