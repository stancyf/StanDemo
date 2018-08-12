package com.example.stan.demo.CallBack;


/**
 * Created by Stan on 2018/8/12.
 */

public class B implements CallBack{

    @Override
    public void callback(String str) {
        System.out.print("B发现了A的改变：" + str);
    }
}
