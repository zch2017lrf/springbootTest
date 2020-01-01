package com.kaleldo.kaleldo.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MenberAnotherProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("初始化时间开始---"+System.currentTimeMillis());
        methodProxy.invokeSuper(object, objects);
        System.out.println("初始化时间结束---"+System.currentTimeMillis());
        return object;
    }
}
