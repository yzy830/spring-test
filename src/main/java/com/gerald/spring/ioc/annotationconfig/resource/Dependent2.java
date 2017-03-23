package com.gerald.spring.ioc.annotationconfig.resource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dxx")
@Primary
public class Dependent2 implements Dependent {
    @Override
    public String getName() {
        return "dependent-2";
    }
}
