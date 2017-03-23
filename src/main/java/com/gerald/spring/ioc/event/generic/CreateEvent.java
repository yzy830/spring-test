package com.gerald.spring.ioc.event.generic;

public class CreateEvent<T> {
    private T source;
    
    public CreateEvent(T source) {
        this.source = source;
    }

    public T getSource() {
        return source;
    }
}
