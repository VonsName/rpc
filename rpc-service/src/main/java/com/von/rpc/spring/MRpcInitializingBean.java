package com.von.rpc.spring;

import com.von.rpc.common.annotation.MRpcService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 15:08
 */
public class MRpcInitializingBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        Map<String, Object> beans = applicationContext.getBeansWithAnnotation(MRpcService.class);
        for (Object bean : beans.values()) {
            if (bean instanceof UserService) {
                UserService userService = (UserService) bean;
                System.out.println(userService);
            }
        }
    }
}
