package com.gerald.spring.ioc.extention;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Requiring {
    private String required; 
    
    private RequiredDependency dependency;
    
    public String getName() {
        return "requiring";
    }

    public String getRequired() {
        return required;
    }

    @org.springframework.beans.factory.annotation.Required
    @Value("${requiring.inject}")
    public void setRequired(String required) {
        this.required = required;
    }

    public RequiredDependency getDependency() {
        return dependency;
    }

    @org.springframework.beans.factory.annotation.Required
    @Resource
    public void setDependency(RequiredDependency dependency) {
        this.dependency = dependency;
    }
}
