package com.joseph.java.thread;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by dongxinyu on 2017/12/3.
 */
public class DaemonThreadTest {
    public static void main(String[] args) {
        System.out.println("Main Thread Start...");
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t2.setDaemon(true);
        t1.start();
        t2.start();
        System.out.println("Main Thread End...");
    }

    public static class Thread1 extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread1 - " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread2 extends Thread {

        @Override
        public void run() {
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("d://test.txt"))) {
                for (int i = 0; i < 15; i++) {
                    System.out.println("Thread2 - " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    writer.write("Thread2 - " + i);
                    writer.write("\r\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
