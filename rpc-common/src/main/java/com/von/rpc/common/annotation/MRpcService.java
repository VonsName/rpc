package com.von.rpc.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 10:45
 */
@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MRpcService {

    String value() default "";
}
