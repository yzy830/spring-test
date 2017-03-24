package com.gerald.spring.aop.advice;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

@Component
public class Target implements TargetInt1 {
    private static final ThreadLocalRandom r = ThreadLocalRandom.current();
    
    public Object process(String name, Integer price) {
        System.out.println("name = " + name + ", price = " + price);
        
        return r.nextInt() % 2 == 0? "args" : 1;
    }
    
    public Object process() {
        System.out.println("no-arg");
        return r.nextInt() % 2 == 0? "no-arg" : 2;
    }
    
    public Object doThrow() {
        if(r.nextBoolean()) {
            throw new IllegalArgumentException("error argument");
        }
        
        return r.nextInt() % 2 == 0? "not throw this time" : 2;
    }

    @Override
    public void showName() {
        System.out.println("Target1");
    }
}
