package com.gerald.spring.aop.proxycreation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aop {
    @Before("execution(* com.gerald.spring.aop.proxycreation.Target.*(..)) && target(target)")
    public void before(Target target) {
        System.out.println("programmatical before advice for target = " + target);
    }
}
