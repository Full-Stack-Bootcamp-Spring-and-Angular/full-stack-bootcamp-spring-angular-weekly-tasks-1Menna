package com.dependencyInjection;

public class Circle implements Shape {
    private Draw2d draw2d;
    private Draw3d draw3d;

    public Circle(Draw2d draw2d, Draw3d draw3d) {
        this.draw2d = draw2d;
        this.draw3d = draw3d;
    }

    public void draw2D(){
        draw2d.draw("Circle");
    }
    public void draw3D(){
        draw3d.draw("Circle");
    }
}
