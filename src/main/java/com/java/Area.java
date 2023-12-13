package com.java;

public class Area {
    public void area(int a){
        double c=a*a;
        System.out.println("Area of square is: "+c);
    }
    public void area(int l,int b){
        double c=l*b;
        System.out.println("Area of rectangle is: "+c);
    }
    public void area(double r){
        double c=2.416*Math.pow(r,2);
        System.out.println("Area of circle is: "+c);
    }
    public static void main(String[] args) {
        Area a=new Area();
        a.area(2);
        a.area(3.1);
        a.area(2,3);
    }
}
