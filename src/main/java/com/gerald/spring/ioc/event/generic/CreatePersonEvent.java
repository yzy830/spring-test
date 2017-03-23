package com.gerald.spring.ioc.event.generic;

public class CreatePersonEvent extends CreateEvent<Person> {

    public CreatePersonEvent(Person source) {
        super(source);
    }

    
}
