package com.kaleldo.kaleldo.annotation;

import com.kaleldo.kaleldo.pojo.TUserRole;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({TUserRole.class})
public @interface EnableTUserTRole {
}
