package com.gerald.spring.aop.advice;

import org.springframework.stereotype.Component;

@Component
public class Target2 implements TargetInt2 {

    @Override
    public String getName() {
        return "Target2";
    }

}
