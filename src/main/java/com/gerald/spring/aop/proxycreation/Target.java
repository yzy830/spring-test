package com.gerald.spring.aop.proxycreation;


public class Target {
    public void doSomething() {
        System.out.println("do something");
    }
    
    @Override
    public String toString() {
        return "programmatic-target";
    }
}
