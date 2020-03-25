package com.kaleldo.kaleldo.threadTest;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class CountDownLatchTest {
    private static ExecutorService ExecutorService = Executors.newFixedThreadPool(2);
    private static CountDownLatch latch = new CountDownLatch(4);

    public static void main(String[] args) throws InterruptedException {
        // 1. 模拟从数据库获取数据
        String[] data = query();
        System.out.println("获取群友名单");

        // 2. 数据处理
        IntStream.range(0, data.length).forEach(i -> {
            ExecutorService.execute(() -> {

                if (i==1){
                    data[i] = "Yellow";
                }
                String value = data[i];
                System.out.println(value+"群友上车成功");
                latch.countDown();
            });
        });
        latch.await(2, TimeUnit.SECONDS); // 最多等待 3秒
        System.out.println("所有群友都处理完了");
        // 关闭线程池
        ExecutorService.shutdown();
        // 3. 保存数据
        save(data);
    }
    private static String[] query() {
        return new String[]{"T", "B", "Y", "K"};
    }
    private static void save(String[] data) {
        System.out.println("踢出群聊名单 - " + Arrays.toString(data));
    }
}
