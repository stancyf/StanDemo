package com.example.stan.demo.Factory;

/**
 * Created by Stan on 2018/8/25.
 */

public class Circle implements Shape{
    public Circle() {
        super();
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
