package com.gerald.spring.aop.pointcuts.args;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Autowired
    private List<Target> targets;
    
    public void show() {
        for(Target target : targets) {
            System.out.println("*****************************");
            
            target.showStr("str123");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
            target.showInt(2);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
            target.showObject(3);
            
            System.out.println("=============================");
        }
    }
}
