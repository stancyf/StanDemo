package com.example.stan.demo.Observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象被观察者
 * 管理注册的观察者
 * Created by Stan on 2018/8/12.
 */

public class Subject {

    //注册的观察者列表
    private List<Observer> mObserverList = new ArrayList<>();

    public void registeObserver(Observer observer) {
        if (!mObserverList.contains(observer)) {
            mObserverList.add(observer);
        } else {
            System.out.println("观察者已经注册!");
        }
    }

    public void unregistObserver(Observer observer) {
        if (mObserverList.contains(observer)) {
            mObserverList.remove(observer);
        } else {
            throw new IllegalArgumentException("参数出错");
        }
    }

    public void notifyAllUpdate(String str) {
        for (int i = 0; i < mObserverList.size(); i++) {
            mObserverList.get(i).update(str);
        }
    }
}
