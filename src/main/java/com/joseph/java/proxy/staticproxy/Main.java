package com.joseph.java.proxy.staticproxy;

/**
 * Created by dongxinyu on 2017/5/29.
 */
public class Main {
    public static void main(String[] args) {
        LoginServiceImpl target = new LoginServiceImpl();
        LoginServiceProxy proxy = new LoginServiceProxy(target);
        proxy.login("Joseph", "abc123");
    }
}
