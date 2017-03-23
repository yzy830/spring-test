package com.gerald.spring.ioc.event.generic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 这个app演示了捕获泛型事件。
 * (1) 可以使用泛型方法捕获任意参数化类型的事件
 * (2) 可以使用参数化类型方法捕获具体类型的事件。此时要求做类型补偿，在这个app中，CreateEvent使用子类补偿；TypeResolverEvent使用ResolvableTypeProvider补偿
 *
 */
@Configuration
@ComponentScan
public class App {        
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class)) {
            MyEventPublisher publisher = context.getBean(MyEventPublisher.class);
            publisher.publishPerson();
            publisher.publishShop();
            publisher.publishGeneric();
            publisher.publishResovablePerson();
            publisher.publishResovableShop();
        }
    }
}
