package com.java;

import java.util.Scanner;

public class SumOfByte {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        byte n1=sc.nextByte();
        System.out.println("Enter 2nd num: ");
        byte n2=sc.nextByte();
        int sum=(int)n1+(int)n2;
        System.out.println(sum);
    }
}
