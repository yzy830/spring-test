package com.gerald.spring.aop.order;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(Ordered.HIGHEST_PRECEDENCE + 1)
public class After1 {
    @After("Pointcuts.target()")
    public void after() {
        System.out.println("after1");
    }
}
