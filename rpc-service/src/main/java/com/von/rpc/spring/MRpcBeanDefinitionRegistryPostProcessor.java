package com.von.rpc.spring;

import com.von.rpc.common.annotation.MRpcService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 13:43
 */
@Component
public class MRpcBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, ApplicationContextAware, BeanNameAware {

    private String beanName;

    private ApplicationContext applicationContext;

    private static final String PACK_AGE_TO_SCAN = "com.von.rpc";

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String getBeanName() {
        return beanName;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        registryMRpcServiceBean(registry, PACK_AGE_TO_SCAN);
    }


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }


    /**
     * 注册Bean到Spring容器中
     *
     * @param registry
     * @param packageToScan
     */
    private void registryMRpcServiceBean(BeanDefinitionRegistry registry, String... packageToScan) {
        MRpcClasspathBeanDefinitionScanner scanner = new MRpcClasspathBeanDefinitionScanner(registry, MRpcService.class);
        scanner.registerMRpcTypeFilter();
        scanner.setBeanNameGenerator(new MRpcBeanNameGenerator());
        scanner.doscan(packageToScan);
    }
}
