package com.joseph.java.proxy.staticproxy;

/**
 * Created by dongxinyu on 2017/5/29.
 */
public class LoginServiceProxy implements LoginService {
    private LoginService loginService;
    public LoginServiceProxy(LoginService target){
        this.loginService = target;
    }
    @Override
    public void login(String username, String password) {
        System.out.println("登录开始...");
        this.loginService.login(username, password);
        System.out.println("登录结束...");
    }
}
