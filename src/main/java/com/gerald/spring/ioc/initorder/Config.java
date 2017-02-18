package com.gerald.spring.ioc.initorder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean(name = "dependent2")
    public BaseDependent2 getDependent2() {
        return new BaseDependent2();
    }
    
    @Bean(name = "base")
    @Lazy
    public Base getBase() {
        Base base = new Base();
//        base.setDependent2(getDependent2());
        
        return base;
    }
}
