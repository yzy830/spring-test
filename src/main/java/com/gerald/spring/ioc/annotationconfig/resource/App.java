package com.gerald.spring.ioc.annotationconfig.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        Depending d= context.getBean(Depending.class);
        System.out.println(d.getD1().getName());
        System.out.println(d.getD2().getName());
    }
}
