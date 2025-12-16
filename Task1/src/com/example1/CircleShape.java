package com.example1;

public class CircleShape implements Shape {

    public void getArea(double r){
        double area = Math.PI*r*r;
        System.out.println("the area of the circle = "+area);
    }
}