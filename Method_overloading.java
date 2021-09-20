package com.company;

public class Method_overloading {
    static void foo() {
        System.out.println("Good Morning Bro");    }

    static void foo(int a)
    {
        System.out.println("Good Morning "+a+" bro");
    }
    public static void main(String[] args) {
        foo();
        foo(20);
    }
}
