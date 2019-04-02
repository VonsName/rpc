package com.von.rpc.spring;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 9:39
 */
public class MRpcBeanNameGenerator implements BeanNameGenerator {

    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        String beanClassName = definition.getBeanClassName();
        Assert.notNull(beanClassName, "BeanClassName 不能为空");
        Class<?> clazz = ClassUtils.resolveClassName(beanClassName, Thread.currentThread().getContextClassLoader());
        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            beanClassName = interfaces[0].getName();
        }
        return beanClassName;
    }
}
