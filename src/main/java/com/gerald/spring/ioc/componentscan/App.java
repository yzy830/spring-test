package com.gerald.spring.ioc.componentscan;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class App {
    @Bean
    public AnotherBean another() {
        return new AnotherBean();
    }
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        
        TestBean t = context.getBean(TestBean.class);
        AnotherBean a = context.getBean(AnotherBean.class);
        System.out.println(t.getName());
        System.out.println(a.getName());
        
        context.close();
    }
}
