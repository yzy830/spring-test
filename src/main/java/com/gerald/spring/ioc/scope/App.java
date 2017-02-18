package com.gerald.spring.ioc.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class App {
    @Bean
//    @Scope(scopeName = "prototype")
    public PrototypeBean getPrototypeBean() {
        return new PrototypeBean();
    }
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        PrototypeBean b1 = context.getBean(PrototypeBean.class);
        PrototypeBean b2 = context.getBean(PrototypeBean.class);
        
        System.out.println(b1.getName());
        System.out.println(b2.getName());
    }
}
