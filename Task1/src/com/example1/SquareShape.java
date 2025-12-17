package com.example1;

public class SquareShape implements Shape {
    public void getArea(double length){
        double area =length*length;
        String output = String.format("the area of the Square = %f",area);
        System.out.println(output);
    }
}