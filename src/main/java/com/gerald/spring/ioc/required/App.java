package com.gerald.spring.ioc.required;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.gerald.spring.ioc.required.Requiring;

@SpringBootApplication
public class App {    
    // 使用工厂方法注入的Bean不在@Required检测之列
//    @Bean
//    public Requiring requiring() {
//        Requiring r = new Requiring();
//        
//        return r;
//    }
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        System.out.println(context.getBean(Requiring.class).getRequired());
        System.out.println(context.getBean(Requiring.class).getDependency());
    }
}
