package com.gerald.spring.aop.order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(Ordered.HIGHEST_PRECEDENCE + 3)
@Aspect
@Component
public class Around1 {
    @Around("Pointcuts.target()")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        try {
            System.out.println("around, before");
            return jp.proceed(jp.getArgs());
        } finally {
            System.out.println("around, after");
        }
    }
}
