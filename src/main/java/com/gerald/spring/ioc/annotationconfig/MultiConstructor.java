package com.gerald.spring.ioc.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MultiConstructor {
    private Dependency1 d1;
    
    private Dependency2 d2;
    
    public MultiConstructor() {
        System.out.println("no-arg");
    }
    
    @Autowired(required = false)
    public MultiConstructor(Dependency1 d1) {
        System.out.println("one-arg");
        this.d1 = d1;
    }
    
//    @Autowired(required = false)
    public MultiConstructor(Dependency1 d1, Dependency2 d2) {
        System.out.println("two-arg");
        this.d1 = d1;
        this.d2 = d2;
    }

    public Dependency1 getD1() {
        return d1;
    }

    public Dependency2 getD2() {
        return d2;
    }
}
