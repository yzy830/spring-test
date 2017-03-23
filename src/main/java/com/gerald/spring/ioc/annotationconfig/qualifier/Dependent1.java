package com.gerald.spring.ioc.annotationconfig.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("main")
public class Dependent1 implements Dependent {

    @Override
    public String getName() {
        return "dependent-1";
    }

}
