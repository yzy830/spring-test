package com.gerald.spring.ioc.initorder;

import org.springframework.stereotype.Service;

//@Service
public class BaseDependent2 {
    private String name = "base-dependent2";
    
    public String getName() {
        return name;
    }
}
