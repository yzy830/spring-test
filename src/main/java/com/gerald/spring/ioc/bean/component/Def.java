package com.gerald.spring.ioc.bean.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Def {
    @Bean
    public Singletone single() {
        return new Singletone();
    }
    
    @Bean(name = "d1")
    public Depending d1() {
        return new Depending(single());
    }
    
    @Bean(name = "d2")
    public Depending d2() {
        return new Depending(single());
    }
}
