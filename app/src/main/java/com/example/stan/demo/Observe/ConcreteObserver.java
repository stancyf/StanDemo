package com.example.stan.demo.Observe;

/**
 * 具体观察者
 * Created by Stan on 2018/8/12.
 */

public class ConcreteObserver extends Observer{

    public ConcreteObserver(int i) {
        super(i);
    }

    @Override
    public void update(String str) {
        System.out.println("" + this.getNum() + "号观察者发现" + "被观察者的状态改变了：" + str);
    }
}
