package com.gerald.spring.ioc.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * 演示了如果通过profile来选择启用的Bean
 *
 */
@Configuration
public class App {
    public static void main( String[] args ) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.getEnvironment().addActiveProfile("active-b1");
            context.register(Def.class);
            context.refresh();
            TestBean t = context.getBean(TestBean.class);
            System.out.println(t.getName());
        }
    }
}
