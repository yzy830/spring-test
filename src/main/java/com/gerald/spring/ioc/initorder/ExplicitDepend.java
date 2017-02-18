package com.gerald.spring.ioc.initorder;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
//@DependsOn("base")
public class ExplicitDepend {
    public ExplicitDepend() {
        System.out.println("explicit depend");
    }
}
