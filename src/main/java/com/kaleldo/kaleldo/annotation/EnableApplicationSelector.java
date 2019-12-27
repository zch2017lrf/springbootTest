package com.kaleldo.kaleldo.annotation;

import com.kaleldo.kaleldo.selector.ApplicationSelector;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({ApplicationSelector.class})
public @interface EnableApplicationSelector {
}
