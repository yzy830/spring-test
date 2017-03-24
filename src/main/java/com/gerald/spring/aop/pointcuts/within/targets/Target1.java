package com.gerald.spring.aop.pointcuts.within.targets;

import org.springframework.stereotype.Component;

@Component
public class Target1 implements Target {

    @Override
    public String getName() {
        return "Target1";
    }
}
