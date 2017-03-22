package com.gerald.spring.ioc.extention;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class CustBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanFactory(
            ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // no-op
    }

    @Override
    public void postProcessBeanDefinitionRegistry(
            BeanDefinitionRegistry registry) throws BeansException {
        GenericBeanDefinition beanDef = new GenericBeanDefinition();
        
        beanDef.setBeanClass(DynamicRegisterBean.class);
        beanDef.setRole(BeanDefinition.ROLE_APPLICATION);
        
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue("name", "yang-test");
        propertyValues.addPropertyValue("depending", new RuntimeBeanReference("dynamicDepending"));
        beanDef.setPropertyValues(propertyValues);
        
        registry.registerBeanDefinition("dynamicRegisterBean", beanDef);
    }

}
