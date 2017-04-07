package com.gerald.spring.externalconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleBean {
    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }  
}
