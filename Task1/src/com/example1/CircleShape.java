package com.example1;

public class CircleShape implements Shape {

    public void getArea(double radius){
        double area = Math.PI*radius*radius;
        String output = String.format("the area of the Square = %f",area);
        System.out.println(output);
    }
}