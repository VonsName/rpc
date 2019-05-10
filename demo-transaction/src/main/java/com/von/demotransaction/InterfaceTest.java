package com.von.demotransaction;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author ： fjl
 * @date ： 2019/5/10/010 9:06
 */
public interface InterfaceTest {

    default void add(){}

    void sou();

    public static void main(String[] args) {
        Method[] methods = InterfaceTest.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println((method.getModifiers()
                    & (Modifier.ABSTRACT | Modifier.PUBLIC | Modifier.STATIC)) == Modifier.PUBLIC);
        }
    }
}
