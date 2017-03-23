package com.gerald.spring.ioc.annotationconfig.resource;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Depending {
    @Resource(name = "d1")
    private Dependent1 d1;
    
    @Resource(name = "dxx1")
    private Dependent2 d2;

    public Dependent getD1() {
        return d1;
    }

    public Dependent2 getD2() {
        return d2;
    }
}
