package com.example.stan.demo.Factory;

/**
 * Created by Stan on 2018/8/25.
 */

public class Square implements Shape {
    public Square() {
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
