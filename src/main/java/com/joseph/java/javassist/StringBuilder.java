package com.joseph.java.javassist;

/**
 * Created by dys09435 on 2016/10/24.
 */
public class StringBuilder {

    private String buildString(int length) {
        // long start = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < length; i++) {
            result += (char) (i % 26 + 'a');
        }
        // long end = System.currentTimeMillis();
        // System.out.println("耗时为 : " + (end - start) + "ms");
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            String result = sb.buildString(Integer.parseInt(args[i]));
            System.out.println("Constructed string of length " + result.length());
        }
    }
}
