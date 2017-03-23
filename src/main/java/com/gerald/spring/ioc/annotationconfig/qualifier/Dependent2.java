package com.gerald.spring.ioc.annotationconfig.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("back")
public class Dependent2 implements Dependent {
    @Override
    public String getName() {
        return "dependent-2";
    }
}
