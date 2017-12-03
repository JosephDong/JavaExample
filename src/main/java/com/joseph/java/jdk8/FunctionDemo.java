package com.joseph.java.jdk8;

import java.util.function.Function;

/**
 * Created by dongxinyu on 2017/7/30.
 */
public class FunctionDemo {

    public static void modifyTheValue(int valueToBeOperated, Function<Integer, Integer> function){
        System.out.println(function.apply(valueToBeOperated));
    }

    public static void main(String[] args) {
        int incr = 20;
        int myNumber = 10;
        modifyTheValue(myNumber, val-> val + incr);

        myNumber = 15;
        modifyTheValue(myNumber, val-> val * 10);
        modifyTheValue(myNumber, val-> val - 100);
        modifyTheValue(myNumber, val-> "somestring".length() + val - 100);
    }
}
