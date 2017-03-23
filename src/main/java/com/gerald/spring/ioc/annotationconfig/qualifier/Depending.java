package com.gerald.spring.ioc.annotationconfig.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Depending {
    @Autowired
    @Qualifier("main")
    private Dependent d;

    public Dependent getD() {
        return d;
    }
}
