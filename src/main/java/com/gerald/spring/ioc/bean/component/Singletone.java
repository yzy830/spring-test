package com.gerald.spring.ioc.bean.component;

public class Singletone {
    private static int count = 0;
    
    private String name;
    
    public Singletone() {
        name = "singletone" + count++;
    }
    
    public String getName() {
        return name;
    }
}
