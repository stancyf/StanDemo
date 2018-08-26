package com.example.stan.demo.ProductConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Stan on 2018/8/26.
 */

public class Producer implements Runnable{
    private volatile boolean isRunning = true;
    private BlockingQueue<PCData> queue;//内存缓冲区
    private static AtomicInteger count = new AtomicInteger();//原子操作 总数
    private static final int SLEEPTIME = 1000;

    public Producer(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    /**
     * 因为BlockingQueue是一个阻塞队列，它的存取可以保证只有一个线程在进行，
     * 所以根据逻辑，生产者在内存满的时候进行等待，并且唤醒消费者队列，
     * 反过来消费者在饥饿状态下等待并唤醒生产者进行生产。
     */
    @Override
    public void run() {
        PCData data = null;
        Random random = new Random();
        System.out.println("start producting id: " + Thread.currentThread().getId());
        while(isRunning){
            try {
                Thread.sleep(random.nextInt(SLEEPTIME));//线程休眠几秒否则数据量太大
                data = new PCData(count.incrementAndGet());
                System.out.println(data + "加入队列");
                if(!queue.offer(data, 2, TimeUnit.SECONDS)){
                    System.out.println("加入队列失败");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
    public void stop(){
        isRunning = false;
    }
}
