package com.gerald.spring.ioc.componentscan;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
    public String getName() {
        return "test-bean";
    }
}
