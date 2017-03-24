package com.gerald.spring.aop.order;

import org.springframework.stereotype.Component;

@Component
public class Target {
    public void doSomething() {
        System.out.println("do something");
    }
}
