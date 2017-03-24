package com.gerald.spring.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Pointcuts {
    @Pointcut("within(com.gerald.spring.aop.order..*) && execution(* Target.*(..))")
    public void target() {}
}
