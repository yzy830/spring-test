package com.gerald.spring.ioc.extention;

import org.springframework.stereotype.Component;

@Component("dynamicDepending")
public class DynamicDepending {
    private String name = "DynamicDepending";

    public String getName() {
        return name;
    }
}
