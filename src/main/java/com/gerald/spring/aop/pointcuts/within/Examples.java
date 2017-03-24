package com.gerald.spring.aop.pointcuts.within;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Examples {
    /**
     * 匹配所有子包
     */
//    @Before("within(com.gerald.spring.aop.within.targets..*)")
    public void aspectAll() {
        System.out.println("Aspect in targets package and its subpackages");
    }
    
    /**
     * 值匹配targets包，不匹配子包
     */
//    @Before("within(com.gerald.spring.aop.within.targets.*)")
    public void aspectCurrentPackage() {
        System.out.println("Aspect in targets package");
    }
    
    /**
     * 匹配一级子包
     */
    @Before("within(com.gerald.spring.aop.within.targets.*.*)")
    public void aspectSubLevel1() {
        System.out.println("Aspect in targets package and level1 subpackage");
    }
}
