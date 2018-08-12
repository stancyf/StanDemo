package com.example.stan.demo.Singleton;

/**
 * 双校验锁单例模式
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * Created by Stan on 2018/8/12.
 */

public class SingletonOne {

    private static volatile SingletonOne sSingletonOne;

    private SingletonOne(){}

    public static SingletonOne getSingletonOne(){
        if(sSingletonOne == null){
            synchronized(SingletonOne.class){
                if (sSingletonOne == null){
                    sSingletonOne = new SingletonOne();
                }
            }
        }
        return sSingletonOne;
    }
}
