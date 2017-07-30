package com.joseph.java.jdk8;

import java.util.Arrays;

/**
 * Created by dongxinyu on 2017/6/25.
 */
public class Test {
    public static void main(String[] args) {
        Arrays.asList("a", "b", "c").sort(String::compareTo);
    }
}
