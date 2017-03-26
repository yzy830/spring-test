package com.gerald.spring.aop.proxycreation;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * <p>演示使用API创建AOP代理。</p>
 * 
 * <p>
 * 显然这里唯一的好处是，不需要托管在Spring上下文中，可以独立使用。但是，这种情况很少
 * </p>
 *
 */
public class App {

    public static void main(String[] args) {
        Target t = new Target();
        AspectJProxyFactory factory = new AspectJProxyFactory(t);
        factory.addAspect(Aop.class);
        
        Target pT = (Target)factory.getProxy();
        pT.doSomething();
    }

}
