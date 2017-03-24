package com.gerald.spring.aop.pointcuts.execution.targets.subtargets;

import org.springframework.stereotype.Component;

import com.gerald.spring.aop.pointcuts.execution.targets.Target;

@Component
public class SubTarget1 implements Target {

    @Override
    public String getName() {
        return "SubTarget1";
    }

}
