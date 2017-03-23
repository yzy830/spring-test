package com.gerald.spring.ioc.bean.parameterdepends;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Def {
    @Bean
    public Singletone single() {
        return new Singletone();
    }
    
    @Bean(name = "d1")
    public Depending d1(Singletone s) {
        return new Depending(s);
    }
    
    @Bean(name = "d2")
    public Depending d2(Singletone s) {
        return new Depending(s);
    }
}
