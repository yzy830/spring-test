package com.gerald.spring.aop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 演示advice的优先级问题。由于在同一个Aspect中，多个advice的优先级是不确定的，这里只演示在不同Aspect中advice的优先级问题
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class App {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
            Target t = context.getBean(Target.class);
            t.doSomething();
        }
    }
}
