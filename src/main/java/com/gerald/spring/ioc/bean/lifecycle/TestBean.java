package com.gerald.spring.ioc.bean.lifecycle;

public class TestBean {
    public TestBean() {
        System.out.println("new...");
    }
    
    public void init() {
        System.out.println("init...");
    }
    
    public void destroy() {
        System.out.println("destroy...");
    }
}
