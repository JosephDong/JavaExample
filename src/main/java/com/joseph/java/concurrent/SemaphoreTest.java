package com.joseph.java.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by dys09435 on 2017/9/8.
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(5);
        //模拟20个客户端访问
        for (int i = 0; i < 20; i++) {
            final int index = i;
            executor.execute(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("获取得执行许可：" + index);
                    Thread.sleep((long) Math.random() * 10000);
                    semaphore.release();
                    System.out.println("---------" + semaphore.availablePermits());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
    }
}
