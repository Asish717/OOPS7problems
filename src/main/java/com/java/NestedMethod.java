package com.java;

public class NestedMethod {
    public void cuboid(int l,int b,int h){
        double result=l*b*h;
        System.out.println("Volume of cuboid: "+result);
        area(l,b,h);
    }
    public void area(int l,int b,int h){
        double result=2*((l*b)+(b*h)+(h*l));
        System.out.println("Area of cuboid: "+result);
        perimeter(l,b,h);
    }
    public void perimeter(int l,int b,int h){
        double result=4*(l+b+h);
        System.out.println("Perimeter of cuboid: "+result);
    }
    public static void main(String[] args) {
        NestedMethod nest=new NestedMethod();
        nest.cuboid(2,3,4);
    }
}
