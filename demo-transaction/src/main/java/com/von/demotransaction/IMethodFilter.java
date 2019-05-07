package com.von.demotransaction;

import java.lang.reflect.Method;

/**
 * @author ： fjl
 * @date ： 2019/5/7/007 13:34
 */
@FunctionalInterface
public interface IMethodFilter {

    boolean match(Method method);
}
