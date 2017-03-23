package com.gerald.spring.ioc.event.custom;


/**
 * 可以不继承ApplicationEvent，将任意一个类用于事件
 *
 */
public class Event2 {

    public String getEventName() {
        return "event-2";
    }
}
