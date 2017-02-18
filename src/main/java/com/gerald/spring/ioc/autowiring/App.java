package com.gerald.spring.ioc.autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        Dependency d = context.getBean(Dependency.class);
        
        System.out.println("list autowiring: ");
        d.getDependingList().stream().forEach(t -> System.out.println(t.getName()));
        
        System.out.println("map autowiring: ");
        d.getDependingMap().entrySet().stream().forEach(t -> System.out.println("key = " + t.getKey() + ", value = " + t.getValue().getName()));
    }
}
