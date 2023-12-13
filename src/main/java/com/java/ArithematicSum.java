package com.java;

public class ArithematicSum {
    public void sum(int a,int b){
        int r=a+b;
        System.out.println(r);
    }
    public void sum(int a,int b,int c){
        int r=a+b+c;
        System.out.println(r);
    }
    public void sum(int a,int b,int c,int d){
        int r=a+b+c+d;
        System.out.println(r);
    }
    public static void main(String[] args) {
        ArithematicSum as=new ArithematicSum();
        as.sum(1,2);
        as.sum(1,2,3);
        as.sum(1,2,3,4);
    }
}
