package com.example.stan.demo.CallBack;

/**
 * Created by Stan on 2018/8/12.
 */

public class Test {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        a.onAttach(b);
        a.change("a改变啦~");
    }
}
