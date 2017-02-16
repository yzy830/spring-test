package com.gerald.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class Base {
    private String name = "base-test";
    
    @Autowired
    private BaseDependent dependent;
    
    public String getName() {
        return name;
    }
    
    public BaseDependent getBaseDependent() {
        return dependent;
    }
}
