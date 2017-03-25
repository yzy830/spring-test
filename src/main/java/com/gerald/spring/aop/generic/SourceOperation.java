package com.gerald.spring.aop.generic;

import org.springframework.stereotype.Component;

@Component
public class SourceOperation {    
    public void processSource(DataSource<?> source) {
        System.out.print("process source, ");
        source.sync();
    }
    
    public <T> void processAny(T arg) {
        System.out.println("process any type, arg = " + arg);
    }
}
