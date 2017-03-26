package com.gerald.spring.aop.advisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>本例演示了如何实现和配置一个advisor</p>
 * 
 * <p>
 *  advisor是Spring AOP独有的，不能使用AspectJ方法配置，只能在schema中配置。
 *  Spring AOP定义了一组接口，用于表示一个Bean是一个Advisor。在&lt;aop:config&gt;
 *  中，定义&lt;aop:advisor&gt;，引用advisor bean就可以完成一个aspect的配置
 * </p>
 *
 */
@SpringBootApplication
@ImportResource("classpath:com/gerald/spring/aop/advisor/aop.xml")
public class App {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
            Target target = context.getBean(Target.class);
            target.doSomething();
        }
    }
}
