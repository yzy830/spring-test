package com.gerald.spring.ioc.event.generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher {
    @Autowired
    private ApplicationEventPublisher publisher;
    
    public void publishPerson() {
        publisher.publishEvent(new CreatePersonEvent(new Person()));
    }
    
    public void publishShop() {
        publisher.publishEvent(new CreateShopEvent(new Shop()));
    }
    
    public void publishGeneric() {
        publisher.publishEvent(new CreateEvent<Shop>(new Shop()));
    }
    
    public void publishResovablePerson() {
        publisher.publishEvent(new TypeResolverEvent<Person>(new Person()));
    }
    
    public void publishResovableShop() {
        publisher.publishEvent(new TypeResolverEvent<Shop>(new Shop()));
    }
}
