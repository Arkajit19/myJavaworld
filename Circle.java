package com.fun;

public class Circle extends Basicinfo{
    final double pi=3.14;
    public double getArea(){

        return (pi*(Math.pow(getRadius(),2)));
    }
}
