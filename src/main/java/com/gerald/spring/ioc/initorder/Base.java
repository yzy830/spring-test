package com.gerald.spring.ioc.initorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.DependsOn;

public class Base {
    private String name = "base-test";
    
    @Autowired
    private BaseDependent dependent;
    
    private BaseDependent2 dependent2;
    
    public Base() {
        System.out.println("base");
    }
    
    public String getName() {
        return name;
    }
    
    public BaseDependent getBaseDependent() {
        return dependent;
    }
    
    @Required
    public void setDependent2(BaseDependent2 dependent2) {
        this.dependent2 = dependent2;
    }
    
    public BaseDependent2 getDependent2() {
        return dependent2;
    }
}
