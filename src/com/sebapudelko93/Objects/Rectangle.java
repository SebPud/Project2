package com.sebapudelko93.Objects;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*width+2*length;
    }
    public double getDiagonal(){
        return Math.sqrt(length*length+width*width);
    }

    @Override
    public String toString() {
        return length+  "\n" + width + "\n" + getArea() + "\n" + getDiagonal() + "\n" + getPerimeter();
    }
}

