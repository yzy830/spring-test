package com.gerald.spring.aop.schema;

public class Aop {
    public void before(Target target) {
        System.out.println("before advice for target = " + target);
    }
}
