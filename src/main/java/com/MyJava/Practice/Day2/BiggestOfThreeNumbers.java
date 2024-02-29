package com.MyJava.Practice.Day2;

public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        int c = 30;

        float BigNumber = Math.max((Math.max(a,b)),c);
        System.out.println("your Biggest number is :" + BigNumber);
    }
}
