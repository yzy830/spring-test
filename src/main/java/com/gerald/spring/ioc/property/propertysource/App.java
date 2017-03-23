package com.gerald.spring.ioc.property.propertysource;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 默认情况下AnnottionConfigApplication只包括JVM属性和JVM环境变量。如果这里不配置{@code PropertySource}，则
 * 使用getProperty得不到<code>requiring.inject</code>的值</br></br>
 * 
 * 使用@PropertySource添加属性无法指定属性的查询顺序，但他一定排在JVM属性和JVM环境变量之后，例如在执行程序时，设定参数
 * -Drequiring.inject=jvm-arg，那么输出的值将会是jvm-arg，而不是在application.properties中指定的
 * requiring-inject</br></br>
 * 
 * 对于AnnotationConfigApplicationContext，属性查找的顺序是
 * <ol>
 * <li>JVM属性</li>
 * <li>JVM环境变量</li>
 * <li>其他{@code PropertySource}引入的属性</li>
 * </ol>
 * </br>
 * 多个{@code PropertySource}配置的加载查找顺序是不确定的，应该要避免属性冲突；在同一个{@code PropertySource}
 * 中配置多个属性文件，如果存在冲突，则取最有一个文件中的值
 */
@Configuration
@ComponentScan
@PropertySource("classpath:/application.properties")
public class App {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(App.class)) {
            String value = context.getEnvironment().getProperty("local");
            System.out.println(value);
            value = context.getEnvironment().getProperty("order");
            System.out.println(value);
            value = context.getEnvironment().getProperty("test");
            System.out.println(value);
        }
    }
}
