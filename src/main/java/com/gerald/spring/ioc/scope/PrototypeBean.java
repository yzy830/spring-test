package com.gerald.spring.ioc.scope;

public class PrototypeBean {
    private static int bean_index = 0;
    
    private String name;
    
    public PrototypeBean() {
        this.name = "BEAN-" + bean_index++;
    }
    
    public String getName() {
        return name;
    }
}
