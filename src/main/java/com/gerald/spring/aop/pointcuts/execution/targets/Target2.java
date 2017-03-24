package com.gerald.spring.aop.pointcuts.execution.targets;

import org.springframework.stereotype.Component;

@Component
public class Target2 implements Target {

    @Override
    public String getName() {
        return "Target2";
    }
}
