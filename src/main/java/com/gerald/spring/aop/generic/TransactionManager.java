package com.gerald.spring.aop.generic;

import org.springframework.stereotype.Component;

@Component
public class TransactionManager {
    public void begin() {
        System.out.println("begin transaction...");
    }
    
    public void commit() {
        System.out.println("commit transaction...");
    }
    
    public void rollback() {
        System.out.println("rollback transaction...");
    }
}
