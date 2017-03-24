package com.gerald.spring.aop.pointcuts.execution;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Examples {
    /**
     * 匹配任意方法
     */
//    @Before("execution(* com.gerald.spring.aop.execution..*.*(..))")
    public void aspectAll() {
        System.out.println("Aspect all...");
    }
    
    /**
     * 配置返回类型为String的方法
     */
//    @Before("execution(String com.gerald.spring.aop.execution.targets.*.*(..))")
    public void aspectReturnType() {
        System.out.println("Aspect by String return type");
    }
    
    /**
     * 配置在subtargets包中返回类型为String的方法
     */
//    @Before("execution(String com.gerald.spring.aop.execution.targets.subtargets.*.*(..))")
    public void aspectReturnTypeInSubtargetsPackage() {
        System.out.println("Aspect by String return type in subtargets package");
    }
    
    /**
     * 匹配只有一个String类型输入名字的方法
     */
//    @Before("execution(* com.gerald.spring.aop.execution.targets.*.*(String))")
    public void aspectStringParameterType() {
        System.out.println("Aspect by String parameter type");
    }
    
    /**
     * 这里说明，在execution指定参数时，与args不同，类型必须严格匹配。例如，这里Object不能匹配String。但是在arg中可以，
     * {@link com.gerald.spring.aop.pointcuts.args.Examples#aspectAll()}
     */
    @Before("execution(* com.gerald.spring.aop.execution.targets.*.*(Object))")
    public void aspectObjectParameterType() {
        System.out.println("Aspect by Object parameter type");
    }
    
    /**
     * 用方法名字匹配
     */
//    @Before("execution(* com.gerald.spring.aop.execution.targets.*.do*(..))")
    public void aspectByMethodName() {
        System.out.println("Aspect by method name like do*");
    }
}
