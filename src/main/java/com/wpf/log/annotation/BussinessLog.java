package com.wpf.log.annotation;

import java.lang.annotation.*;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 14:45 2018/6/12
 * @Modified by
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface BussinessLog {

    /**
     * 实际的业务操作
     */
    String value() default "";

    /**
     * 被修改的实体的唯一标识,例如:菜单实体的唯一标识为"id"
     */
    String key() default "id";

    /**
     * 描述
     */
    String dict() default "SystemDict";
}
