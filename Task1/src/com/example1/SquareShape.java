package com.example1;

public class SquareShape implements Shape {
    public void getArea(double l){
        double area =l*l;
        System.out.println("the area of the Square = "+area);
    }
}