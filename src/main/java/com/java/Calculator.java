package com.java;

import java.util.Scanner;

public class Calculator {
    public void userInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2=sc.nextInt();
        Calculator c=new Calculator();
        System.out.println(c.add(n1,n2));
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.userInput();
    }
}
