package com.example.stan.demo.Factory;

/**
 * Created by Stan on 2018/8/25.
 */

public class Factory {
    public Factory(){}
    public Shape getShape(String str){
        if(str == null){
            return null;
        }
        if(str.equalsIgnoreCase("Square")){
            return new Square();
        }
        if(str.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        if(str.equalsIgnoreCase("Tranangle")){
            return new Tranangle();
        }
        return null;
    }
}
