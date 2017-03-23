package com.gerald.spring.ioc.annotationconfig.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Depending {
    @Autowired
    private Dependent d;

    public Dependent getD() {
        return d;
    }
}
