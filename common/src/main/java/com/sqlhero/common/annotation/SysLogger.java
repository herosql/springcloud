package com.sqlhero.common.annotation;

import java.lang.annotation.*;

/**
 * @author ：sqlhero.
 * @date ：Created in 11:21 2018/12/3
 * @description ：日常
 * @modified By：
 * @version: 0.0.1
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLogger {
    String value() default "";
}
