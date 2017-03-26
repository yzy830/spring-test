package com.gerald.spring.aop.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class AroundInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) {
        try {
            System.out.println("before invoke target");
            Object retVal = invocation.proceed();
            System.out.println("after invoke target");
            return retVal;
        } catch(Throwable t) {
            System.out.println("target fail with exception = " + t.getMessage());
            return null;
        }
    }

}
