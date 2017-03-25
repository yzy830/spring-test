package com.gerald.spring.aop.generic;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {
    @Autowired
    private TransactionManager manager;
    
    /**
     * <p>
     * 这个案例说明，<b>无法</b>根据目标类型实现的参数化接口来细化pointcut。
     * </p>
     * 
     * <p>
     * 在本例中，虽然使用了target(shopDs)，并且shopDs具有<code>DataSource&lt;ShopModel&gt;</code>
     * 类型。但是这个拦截器依然会拦截到实现DataSource<GoodsModel>的对象
     * </p>
     */
    @Around("within(com.gerald.spring.aop.generic..*) && execution(* DataSource.*(..)) && target(shopDs)")
    public Object genericTarget(ProceedingJoinPoint jp, DataSource<ShopModel> shopDs) throws Throwable {
        try {
            manager.begin();
            Object result = jp.proceed(jp.getArgs());
            manager.commit();
            return result;
        } catch(RuntimeException e) {
            manager.rollback();
            throw e;
        } catch(Throwable t) {
            manager.commit();
            throw t;
        }
    }
    
    /**
     * <p>
     * 这个案例说明，<b>无法</b>根据join point的参数化类型(ParamterizedType)参数细化pointcut
     * </p>
     * 
     * <p>
     * 在本例中，虽然使用了target(shopDs)，并且shopDs具有<code>DataSource&lt;ShopModel&gt;</code>
     * 类型。但是这个拦截器依然会拦截到实现DataSource<GoodsModel>的对象
     * </p>
     */
    @Before("within(com.gerald.spring.aop.generic..*) && execution(* SourceOperation.*(..)) && args(shopDs)")
    public void parameterizedArg(DataSource<ShopModel> shopDs) {
        System.out.println("before parameterized args");
    }
    
    /**
     * 这个案例说明，<b>可以</b>根据具体类型筛选TypeVariable类型的参数
     */
    @Before("within(com.gerald.spring.aop.generic..*) && execution(* SourceOperation.*(..)) && args(num)")
    public void typeVariableArg(Number num) {
        System.out.println("beore Number arg");
    }
}
