package com.gerald.spring.ioc.externalconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        ValueConfig valueConfig = context.getBean(ValueConfig.class);
        System.out.println(valueConfig.getName());
        
        DependingExternal depending = context.getBean(DependingExternal.class);
        System.out.println("url = " + depending.getUrl());
    }
}
