package org.bupt.aiop.restapi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解用于权限认证
 * Created by zlren on 17/6/10.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequiredRoles {
    // List<String> roles() default ;
    String[] roles() default {};
}
