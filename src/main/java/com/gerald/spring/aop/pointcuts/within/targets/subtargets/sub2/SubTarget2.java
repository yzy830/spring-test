package com.gerald.spring.aop.pointcuts.within.targets.subtargets.sub2;

import org.springframework.stereotype.Component;

import com.gerald.spring.aop.pointcuts.within.targets.Target;

@Component
public class SubTarget2 implements Target {

    @Override
    public String getName() {
        return "SubTarget2";
    }

}
