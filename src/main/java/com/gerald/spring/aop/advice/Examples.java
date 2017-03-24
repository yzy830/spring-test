package com.gerald.spring.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Examples {
    @Pointcut("within(com.gerald.spring.aop.advice.*)")
    private void advicePackage() {}
    
    @Pointcut("execution(* Target.*(..))")
    private void targetMethods() {
        
    }
    
    @Pointcut("args(strVal,intVal)")
    private void specifyArgs(String strVal, Integer intVal) {
        
    }
    
    @Pointcut("target(int1)")
    private void int1(TargetInt1 int1) {}
    
    @Pointcut("target(int2)")
    private void int2(TargetInt2 int2) {}
    
    /**
     * <p>
     * 演示了如果捕获join point的参数。当在advice(例如{@link #before(String, Integer)})
     * 和pointcut(例如{@link #specifyArgs(String, Integer)})中存在参数是，args或者具有参数的pointcut，
     * 需要使用被修改方法的参数名称作为入参，而不是参数类型。
     * </p>
     * <p>
     * 当没有参数时，需要使用类型，例如{@link com.gerald.spring.aop.pointcuts.args.Examples#aspectNumber()}
     * </p>
     * 
     * @param strVal
     * @param intVal
     */
    @Before("advicePackage() && targetMethods() && specifyArgs(strVal,intVal)")
    public void before(JoinPoint jp, String strVal, Integer intVal) {
        System.out.println("target = " + jp.getTarget().getClass().getName() + ", before, strValue = " + strVal + ", intValue = " + intVal);
    }
    
    /**
     * 成功返回，不捕获返回值
     */
    @AfterReturning("advicePackage() && targetMethods()")
    public void afterReturn() {
        System.out.println("after returning, not capture return value");
    }
    
    /**
     * 捕获整型返回值。从这种动态性可以看出，使用{@code AfterReturning}的returning属性来匹配join point，是
     * 一种动态捕获，他会分析返回值的动态类型，因此必需要结合Kinded和Scoping的指示符使用，否则效率上会很差
     * 
     * @param returnValue
     */
    @AfterReturning(value = "advicePackage() && targetMethods()", returning = "returnValue")
    public void afterReturnInt(Integer returnValue) {
        System.out.println("the Integer return value = " + returnValue);
    }
    
    /**
     * 捕获字符串类型返回值。这个实例显示了，在捕获返回值的同时，也可以捕获JoinPoint，但JoinPoint必须要是第一个入参
     * 
     * @param returnValue
     */
    @AfterReturning(value = "advicePackage() && targetMethods()", returning = "returnValue")
    public void afterReturnStr(JoinPoint jp, String returnValue) {
        System.out.println("target name = " + jp.getTarget().getClass().getName() + ", the String return value = " + returnValue);
    }
    
    /**
     * {@code AfterThrowing}和{@code AfterReturning}相似，具有动态捕获异常参数的功能。
     * 
     * @param e
     */
    @AfterThrowing(pointcut = "advicePackage() && targetMethods()", throwing = "e")
    public void afterException(Exception e) {
        System.out.println("any exception, message = " + e.getMessage());
    }
    
    @After("advicePackage() && targetMethods()")
    public void after() {
        System.out.println("normal after, can capture return value or exception");
    }
    
    /**
     * {@code Around} advice方法返回值是客户端会得到的返回值。
     */
    @Around("advicePackage() && targetMethods()")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        try {
            System.out.println("around before");
            return jp.proceed(jp.getArgs());
        } catch(Throwable e) {
            throw e;
        } finally {
            System.out.println("around after");
        }
    }
    
    /**
     * 使用target的接口类型过滤
     * 
     * @param int2
     */
    @Before("advicePackage() && int2(int2)")
    public void beforeWithTarget(TargetInt2 int2) {
        System.out.println("before with target, name = " + int2.getName());
    }
}
