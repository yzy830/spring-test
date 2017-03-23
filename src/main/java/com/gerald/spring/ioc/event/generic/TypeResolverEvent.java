package com.gerald.spring.ioc.event.generic;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

public class TypeResolverEvent<T> extends ApplicationEvent implements ResolvableTypeProvider {

    /**
     * 
     */
    private static final long serialVersionUID = -2013788561347848995L;

    public TypeResolverEvent(T source) {
        super(source);
    }

    @Override
    public ResolvableType getResolvableType() {
        return ResolvableType.forClassWithGenerics(getClass(), ResolvableType.forInstance(getSource()));
    }

}
