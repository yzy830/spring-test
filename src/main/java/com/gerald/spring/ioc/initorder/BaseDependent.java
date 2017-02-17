package com.gerald.spring.ioc.initorder;

public class BaseDependent {
    private String name = "base-dependent";
    
    public BaseDependent() {
        System.out.println("base dependent");
    }

    public String getName() {
        return name;
    }    
}
