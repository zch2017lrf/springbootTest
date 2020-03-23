package com.kaleldo.kaleldo.filter;

import org.springframework.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class MenberFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {
        if ("info".equals(method.getName()))
        return 0;
        return 1;
    }
}
