package com.gerald.spring.aop.schema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>演示了如果使用schema方式定义aop</p>
 * <p>
 * schema方式与AspectJ方式的功能基本一致，配置方式也基本对应。
 * 主要的差别是有两点
 * <ol>
 * <li>在schema中，不能组合pointcut，构成更复杂的pointcut</li>
 * <li>条件运算符不能使用&&、||、!，需要使用and、or、not</li>
 * </ol>
 * </p>
 *
 */
@SpringBootApplication
@ImportResource("classpath:com/gerald/spring/aop/schema/aop.xml")
public class App {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
            Target t = context.getBean(Target.class);
            t.doSomething();
        }
    }
}
