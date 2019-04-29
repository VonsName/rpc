package com.von.demotransaction;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ： fjl
 * @date ： 2019/4/29/029 13:58
 */
public class CGlibProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {


        System.out.println("cglib before---");
        Object res = methodProxy.invoke(target, args);
//        Object res = methodProxy.invokeSuper(o, args);
//        Object res = method.invoke(target, args);
        System.out.println("cglib after----");
        return res;
    }

    public static void main(String[] args) {
        CGlibProxy cGlibProxy=new CGlibProxy();
        StrawBerry proxyInstance = (StrawBerry) cGlibProxy.getInstance(new StrawBerry());
        proxyInstance.eat();
    }
}
