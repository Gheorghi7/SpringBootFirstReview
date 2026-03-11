package org.example.eventhandling;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    public void publishEvent() {
        MyEvent myEvent = new MyEvent(this);
        publisher.publishEvent(myEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;

    }
}
