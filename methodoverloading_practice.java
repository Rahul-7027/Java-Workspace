package com.company;

public class methodoverloading_practice {
    static int add(int a, int b)
    {
        int c;
        return c=a+b;
    }
    static int add(int a, int b,int c)
    {
        int d;
        return d=a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(methodoverloading_practice.add(10,10));
        System.out.println(methodoverloading_practice.add(10,10,10));
    }
}
