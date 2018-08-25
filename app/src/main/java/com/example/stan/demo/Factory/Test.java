package com.example.stan.demo.Factory;

/**
 * Created by Stan on 2018/8/25.
 */

public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape tranangle = factory.getShape("Tranangle");
        tranangle.draw();
        Shape circle = factory.getShape("Circle");
        circle.draw();
        Shape square = factory.getShape("Square");
        square.draw();
    }
}
