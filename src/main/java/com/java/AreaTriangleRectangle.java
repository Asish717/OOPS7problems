package com.java;

public class AreaTriangleRectangle {
    public double rectangle(double length,double breadth){
        return length*breadth;
    }
    public double triangle(double base,double height){
        return 0.5*base*height;
    }

    public static void main(String[] args) {
        AreaTriangleRectangle area=new AreaTriangleRectangle();
        System.out.println("Area of rectangle: "+area.rectangle(3,4));
        System.out.println("Area of triangle: "+area.triangle(4,5));
    }
}
