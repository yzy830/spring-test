package com.gerald.spring.aop.pointcuts.programmic;

import org.springframework.stereotype.Service;


@Service
public class Target {
    public void foo() {
        System.out.println("foo");
    }
}
