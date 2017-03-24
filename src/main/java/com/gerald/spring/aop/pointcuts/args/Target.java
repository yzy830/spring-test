package com.gerald.spring.aop.pointcuts.args;

import org.springframework.stereotype.Component;

@Component
public class Target {
    public void showStr(String value) {
        System.out.println("string value = " + value);
    }
    
    public void showInt(Integer value) {
        System.out.println("integer value = " + value);
    }
    
    public void showObject(Object value) {
        System.out.println("object vlaue = " + value);
    }
}
