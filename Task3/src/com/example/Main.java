package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Circle circle = container.getBean("myCircle",Circle.class);
        circle.draw2D();

        Square square = container.getBean("mySquare",Square.class);
        square.draw2D();
    }
}