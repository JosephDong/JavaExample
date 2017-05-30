package com.joseph.java.proxy.dynamicproxy;

/**
 * Created by dongxinyu on 2017/5/29.
 */
public class LoginServiceImpl implements LoginService {
    @Override
    public void login(String username, String password) {
        System.out.printf("当前登录用户为：%s \n" ,username);
        //TODO 登录处理
    }
}
