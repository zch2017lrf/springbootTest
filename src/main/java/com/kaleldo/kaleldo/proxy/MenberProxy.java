package com.kaleldo.kaleldo.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MenberProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("初始化中------------");
        methodProxy.invokeSuper(object, objects);
        System.out.println("初始化完毕----------");
        return object;
    }
}
