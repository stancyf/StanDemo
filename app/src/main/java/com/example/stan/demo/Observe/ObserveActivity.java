package com.example.stan.demo.Observe;

/**
 * Created by Stan on 2018/8/12.
 */

public class ObserveActivity{
    public static void main(String[] args){
        ConcreteObserver concreteObserver1 = new ConcreteObserver(1);
        ConcreteObserver concreteObserver2 = new ConcreteObserver(2);
        ConcreteSubjet concreteSubjet = new ConcreteSubjet();
        concreteSubjet.registeObserver(concreteObserver1);
        concreteSubjet.registeObserver(concreteObserver2);
        System.out.println("被观察者的状态为：" + concreteSubjet.getOldStr());
        concreteSubjet.change("赶紧更新哈~");
    }
}
