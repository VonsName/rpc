package com.von.demotransaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ： fjl
 * @date ： 2019/4/29/029 14:05
 */
public class JDKProxy {


    static class MyHandler implements InvocationHandler{

        private Object target;

        public MyHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("jdk before");
            Object res = method.invoke(target, args);
            System.out.println("jdk after");
            return res;
        }
    }


    public static Object getIns(Class clazz,Object target){
        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new MyHandler(target));
    }

    public static void main(String[] args) {

        Fruit ins = (Fruit) JDKProxy.getIns(Fruit.class, new StrawBerry());
        ins.eat();
    }
}
