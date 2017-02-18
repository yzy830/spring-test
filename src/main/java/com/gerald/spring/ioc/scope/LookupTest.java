package com.gerald.spring.ioc.scope;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class LookupTest {
    @Lookup
    public PrototypeBean createBean() {
        return null;
    }
    
    public void consume() {
        System.out.println(createBean().getName());
    }
}
