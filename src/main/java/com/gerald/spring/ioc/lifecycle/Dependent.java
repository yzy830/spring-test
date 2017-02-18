package com.gerald.spring.ioc.lifecycle;

import org.springframework.stereotype.Component;

@Component
public class Dependent {
    private String name = "dependent";
    
    public String getName() {
        return name;
    }
}
