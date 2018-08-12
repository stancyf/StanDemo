package com.example.stan.demo.Observe;

/**
 * 具体被观察者
 * Created by Stan on 2018/8/12.
 */

public class ConcreteSubjet extends Subject{

    private Observer mObserver;
    private String oldStr = "旧的字符串";

    public String getOldStr(){
        return oldStr;
    }

    public void change(String str){
        this.notifyAllUpdate(str);
    }

}
