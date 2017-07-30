package com.joseph.java;

import org.junit.Test;

import java.util.Base64;

/**
 * Created by dongxinyu on 2017/7/5.
 */
public class Base64Test {

    @Test
    public void test(){
        byte[] s = Base64.getEncoder().encode("0w!".getBytes());
    }
}
