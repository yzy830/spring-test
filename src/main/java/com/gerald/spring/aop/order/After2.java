package com.gerald.spring.aop.order;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(Ordered.HIGHEST_PRECEDENCE + 2)
public class After2 {
    @After("Pointcuts.target()")
    public void after2() {
        System.out.println("after2");
    }
}
