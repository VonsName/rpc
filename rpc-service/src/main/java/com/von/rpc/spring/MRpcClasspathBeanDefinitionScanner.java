package com.von.rpc.spring;

import com.von.rpc.common.annotation.MRpcService;
import com.von.rpc.config.MRpcZkRegistryConfig;
import com.von.rpc.protocol.MRpcProtocol;
import com.von.rpc.zookeeper.MRpcZkClient;
import com.von.rpc.zookeeper.MRpcZkRegistry;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkConnection;
import org.apache.zookeeper.CreateMode;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.lang.annotation.Annotation;
import java.util.Map;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 13:46
 */
public class MRpcClasspathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

    private Class<? extends Annotation> clazz;

    private BeanDefinitionRegistry registry;

    public MRpcClasspathBeanDefinitionScanner(BeanDefinitionRegistry registry, Class<? extends Annotation> clazz) {
        super(registry, false);
        this.clazz = clazz;
        this.registry = registry;
    }

    public void registerMRpcTypeFilter() {
        addIncludeFilter(new AnnotationTypeFilter(clazz));
    }

    public void doscan(String... packages) {
        super.doScan(packages);
    }

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        applicationContext.refresh();
        Map<String, Object> beans = applicationContext.getBeansWithAnnotation(MRpcService.class);
        for (Object bean : beans.values()) {

            Class<?>[] interfaces = bean.getClass().getInterfaces();
            String name = interfaces[0].getName();
            MRpcZkRegistryConfig config = new MRpcZkRegistryConfig();
            config.setRegistryAddress("localhost");
            config.setRegistryPort(2181);
            config.setRegistryProtocol(MRpcProtocol.DEFAULT_PROTOCOL);
            ZkConnection connection = new ZkConnection(config.getRegistryAddress() + ":" + config.getRegistryPort());
            MRpcZkClient mRpcZkClient = new MRpcZkClient(connection);
            config.setRegistryData(name);
            MRpcZkRegistry mRpcZkRegistry = new MRpcZkRegistry(config);
            mRpcZkRegistry.setmRpcZkClient(mRpcZkClient);
            mRpcZkRegistry.registry();
        }

//      org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode

//        ZkConnection connection = new ZkConnection("localhost:2181");
//        ZkClient zkClient = new ZkClient(connection);
//        zkClient.createEphemeral("/mdubbo/provider");
    }
}
