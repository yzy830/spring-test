package com.gerald.spring.ioc.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Depending {
    @Autowired
    private Dependent depending;
    
    @PostConstruct
    public void init() {
        System.out.println("init, injected bean = " + depending.getName());
    }
    
    @PreDestroy
    public void close() {
        System.out.println("close");
    }
}
