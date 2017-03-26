package com.gerald.spring.aop.schema;


public class Target {
    public void doSomething() {
        System.out.println("do something");
    }
    
    @Override
    public String toString() {
        return "shema-target";
    }
}
