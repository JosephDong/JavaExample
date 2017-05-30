package com.joseph.java.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dongxinyu on 2017/5/29.
 */
public class LoginServiceProxy implements InvocationHandler {
    private Object obj;

    public LoginServiceProxy(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("登录开始，并记录当前时间...");
        Object result = method.invoke(obj, args);
        System.out.println("登录结束，并记录当前时间...");
        return result;
    }
}
