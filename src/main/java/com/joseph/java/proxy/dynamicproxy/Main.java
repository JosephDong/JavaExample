package com.joseph.java.proxy.dynamicproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * Created by dongxinyu on 2017/5/29.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        LoginService loginService = (LoginService) Proxy.newProxyInstance(LoginService.class.getClassLoader(), new
                Class[]{LoginService.class}, new LoginServiceProxy(new LoginServiceImpl()));
        System.out.println(loginService.getClass().getName());
        loginService.login("Joseph", "test");

        //生成代理类二进制文件
        String className = "ProxyTest";
        byte[] data = ProxyGenerator.generateProxyClass(className, new Class[]{LoginService.class});
        FileOutputStream out = new FileOutputStream(className + ".class");
        out.write(data);
        out.close();
    }
}
