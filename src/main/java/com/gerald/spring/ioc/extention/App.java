package com.gerald.spring.ioc.extention;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        DynamicRegisterBean b = context.getBean(DynamicRegisterBean.class);
        System.out.println(b.getName());
        System.out.println(b.getDepending().getName());
    }
}
