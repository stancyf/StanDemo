package com.example.stan.demo.CallBack;

/**
 * Created by Stan on 2018/8/12.
 */

public class A {

    private CallBack mCallBack;

    public void onAttach(CallBack callBack) {
        this.mCallBack = callBack;
    }

    public void change(String str) {
        mCallBack.callback(str);
    }
}
