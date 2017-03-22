package com.gerald.spring.ioc.extention;

public class DynamicRegisterBean {
    private String name;
    
    private DynamicDepending depending;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DynamicDepending getDepending() {
        return depending;
    }

    public void setDepending(DynamicDepending depending) {
        this.depending = depending;
    }
}
