package com.gerald.spring.ioc.event.custom;

import org.springframework.context.ApplicationEvent;

public class Event1 extends ApplicationEvent {

    /**
     * 
     */
    private static final long serialVersionUID = -4247960170957369026L;

    public Event1(Object source) {
        super(source);
        // TODO Auto-generated constructor stub
    }

    public String getEventName() {
        return "event-1";
    }
}
