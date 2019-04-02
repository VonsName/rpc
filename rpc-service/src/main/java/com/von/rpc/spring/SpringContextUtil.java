package com.von.rpc.spring;

import org.springframework.context.ApplicationContext;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 16:27
 */
public class SpringContextUtil {

    public static ApplicationContext getApplicatonContext(){
        return new MRpcBeanDefinitionRegistryPostProcessor().getApplicationContext();
    }
}
