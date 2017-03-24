package com.gerald.spring.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(Ordered.HIGHEST_PRECEDENCE + 1)
@Aspect
@Component
public class Before1 {
    @Before("Pointcuts.target()")
    public void before1() {
        System.out.println("before 1");
    }
}
