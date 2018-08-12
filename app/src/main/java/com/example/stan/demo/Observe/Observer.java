package com.example.stan.demo.Observe;

/**
 * 观察者抽象类
 * Created by Stan on 2018/8/12.
 */

public abstract class Observer {

    //观察者序号
    private int num;

    public Observer(int i) {
        super();
        this.num = i;
    }

    public int getNum(){
        return num;
    }

    //回调方法
    abstract void update(String str);
}
