package com.gerald.spring.aop.pointcuts.execution.targets;

import org.springframework.stereotype.Component;

@Component
public class Target1 implements Target {

    @Override
    public String getName() {
        return "Target1";
    }
}
