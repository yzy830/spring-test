package com.gerald.spring.ioc.annotationconfig.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Dependent1 implements Dependent {

    @Override
    public String getName() {
        return "dependent-1";
    }

}
