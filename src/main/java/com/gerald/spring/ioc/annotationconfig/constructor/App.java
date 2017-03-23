package com.gerald.spring.ioc.annotationconfig.constructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        MultiConstructor m = context.getBean(MultiConstructor.class);
        System.out.println(m.getD1());
        System.out.println(m.getD2());
    }
}
