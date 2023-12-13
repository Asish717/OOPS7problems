package com.java;

public class CountObjectClass {
    static int i;
    CountObjectClass(){
        i++;
    }
    public static void main(String[] args) {
        CountObjectClass obj=new CountObjectClass();
        CountObjectClass obj1=new CountObjectClass();
        CountObjectClass obj2=new CountObjectClass();
        System.out.println(i);
    }
}
