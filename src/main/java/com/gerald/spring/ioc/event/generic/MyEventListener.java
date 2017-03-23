package com.gerald.spring.ioc.event.generic;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {
    @EventListener
    public void onPersonCreateEvent(CreateEvent<Person> event) {
        System.out.println("on person create, " + event.getSource());
    }
    
    @EventListener
    public void onShopCreateEvent(CreateEvent<Shop> event) {
        System.out.println("on shop create, " + event.getSource());
    }
    
    @EventListener
    public <T> void onCreateEvent(CreateEvent<T> event) {
        System.out.println("on generic create, " + event.getSource());
    }
    
    @EventListener
    public void onResovablePersion(TypeResolverEvent<Person> event) {
        System.out.println("on resovable person, " + event.getSource());
    }
    
    @EventListener
    public void onResovableShop(TypeResolverEvent<Shop> event) {
        System.out.println("on resovable Shop, " + event.getSource());
    }
}
