package com.gerald.spring.aop.pointcuts.within.targets;

public interface Target {
    default void showName() {
        System.out.println(getName());
    }
    
    default void doSomething() {
        System.out.println(String.format("[%s] do something", getName()));
    }
    
    default void doSpecific(String active) {
        System.out.println(String.format("[%s] do active[%s]", getName(), active));
    }
    
    String getName();
}
