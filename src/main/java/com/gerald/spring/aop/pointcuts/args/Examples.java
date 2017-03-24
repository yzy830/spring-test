package com.gerald.spring.aop.pointcuts.args;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Examples {
    /**
     * 匹配所有子包
     */
//    @Before("args(Object) && within(com.gerald.spring.aop.pointcuts.args.*)")
    public void aspectAll() {
        System.out.println("Aspect with single method with type Object");
    }
    
    @Before("args(Number) && within(com.gerald.spring.aop.pointcuts.args.*)")
    public void aspectNumber() {
        System.out.println("Aspect with single method with type Number");
    }
    
//    @Before("args(String) && within(com.gerald.spring.aop.pointcuts.args.*)")
    public void aspectString() {
        System.out.println("Aspect with single method with type String");
    }
}
