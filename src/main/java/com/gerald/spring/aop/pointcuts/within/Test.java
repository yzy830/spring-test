package com.gerald.spring.aop.pointcuts.within;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gerald.spring.aop.pointcuts.within.targets.Target;

@Component
public class Test {
    @Autowired
    private List<Target> targets;
    
    public void show() {
        for(Target target : targets) {
            System.out.println("*****************************");
            
            System.out.println(String.format("target name is [%s]", target.getName()));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
            target.showName();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
            target.doSomething();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
            target.doSpecific("special");
            
            System.out.println("=============================");
        }
    }
}
