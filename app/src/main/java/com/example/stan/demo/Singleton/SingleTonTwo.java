package com.example.stan.demo.Singleton;

/**
 * 静态内部类单例模式
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * Created by Stan on 2018/8/12.
 */

public class SingleTonTwo {

    private SingleTonTwo(){}

    //外部类被成功加载并初始化，此时并未导致内部类也跟着被初始化
    private static class SingleTonTwoHolder{
        private static final SingleTonTwo SINGLE_INSTANCE = new SingleTonTwo();
    }

    public static SingleTonTwo getInstance(){
        return SingleTonTwoHolder.SINGLE_INSTANCE;
    }
}


