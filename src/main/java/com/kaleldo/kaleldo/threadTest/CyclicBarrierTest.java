package com.kaleldo.kaleldo.threadTest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(2, new Thread(() -> {
            System.out.println("发车，嘟嘟嘟");
        }));
        System.out.println("快上车来不及解释了");
        boolean a = false;

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("小王已上车");
                barrier.await();
                System.out.println("所有人已上车，发车");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }, "小王").start();

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("小李已上车");
                try {
                    barrier.await(1, TimeUnit.SECONDS);
                    System.out.println("所有人已上车，发车");
                } catch (TimeoutException e) {
                    System.out.println("有人没上车,下车!");
                    e.printStackTrace();
                }

            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }, "小李").start();
    }
}
