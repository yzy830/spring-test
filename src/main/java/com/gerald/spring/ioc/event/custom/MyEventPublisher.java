package com.gerald.spring.ioc.event.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher {
    @Autowired
    private ApplicationEventPublisher publisher;
    
    public void publishEvent1() {
        publisher.publishEvent(new Event1(this));
    }
}
