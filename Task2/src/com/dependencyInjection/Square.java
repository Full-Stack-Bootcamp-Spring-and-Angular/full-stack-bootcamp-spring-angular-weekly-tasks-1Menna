package com.dependencyInjection;

public class Square implements Shape {
    private Draw2d draw2d;
    private Draw3d draw3d;

    public void setDraw2d(Draw2d draw2d) {
        this.draw2d = draw2d;
    }

    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    public void draw2D(){
        draw2d.draw("Square");
    }
    public void draw3D(){draw3d.draw("Square");}
}
