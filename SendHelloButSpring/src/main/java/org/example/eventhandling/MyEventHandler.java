package org.example.eventhandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyEventHandler implements ApplicationListener {

    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println(myEvent.toString());

    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {

    }
}
