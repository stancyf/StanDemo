package com.example.stan.demo.ProductConsumer;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Stan on 2018/8/26.
 */

public class Consumer implements Runnable {
    private BlockingQueue<PCData> queue;
    private static final int SLEEPTIME = 1000;

    public Consumer(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start Consumer id :" + Thread.currentThread().getId());
        Random r = new Random();
        try {
            while (true) {
                //take方法自带阻塞效果，即队列中有消息则取出，否则阻塞等待；
                PCData data = queue.take();
                if (data != null) {
                    int re = data.getData() * data.getData();
                    System.out.println(MessageFormat.format("{0}*{1}={2}", data.getData(), data.getData(), re));
                    Thread.sleep(r.nextInt(SLEEPTIME));//线程休眠几秒否则数据量太大
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

}
