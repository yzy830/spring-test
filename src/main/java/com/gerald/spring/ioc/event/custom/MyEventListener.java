package com.gerald.spring.ioc.event.custom;

import java.util.concurrent.TimeUnit;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {
    
    @EventListener
    @Order(2)
    public void onEvent1_3(Event1 event1) {
        System.out.println("onEvent1_3 process " + event1.getEventName() + ", thread id = " + Thread.currentThread().getId());
    }

    @EventListener
    @Order(1)
    public Event2 onEvent1(Event1 event1) {
        System.out.println("onEvent1 process " + event1.getEventName() + ", thread id = " + Thread.currentThread().getId());
        System.out.println("dispatch event2...");
        return new Event2();
    }
    
    @EventListener
    @Order(3)
    public void onEvent1_2(Event1 event1) {
        System.out.println("onEvent1_2 process " + event1.getEventName() + ", thread id = " + Thread.currentThread().getId());
    }
    
    @EventListener
    @Async
    public void onEvent2(Event2 event2) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("process " + event2.getEventName() + ", thread id = " + Thread.currentThread().getId());
    }
}
