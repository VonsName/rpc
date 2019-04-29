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

    private Object proxy;

    public Object getInstance(Object proxy) {
        this.proxy = proxy;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.proxy.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {


        System.out.println("before---");
        Object res = methodProxy.invokeSuper(o, objects);
        System.out.println("after----");
        return res;
    }

    public static void main(String[] args) {
        CGlibProxy cGlibProxy=new CGlibProxy();
        StrawBerry proxyInstance = (StrawBerry) cGlibProxy.getInstance(new StrawBerry());
        proxyInstance.eat();
    }
}
