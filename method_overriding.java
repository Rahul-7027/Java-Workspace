package com.company;

class A {
    public int a;

    public void meth1() {
        System.out.println("I am method of class A");
    }

    public void meth2() {
        System.out.println("I am method meth2 of class A");
    }
}

class B extends A {
    @Override
    public void meth2() {
        System.out.println("I am method meth2 of class b");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        B b1 = new B();
        b1.meth2();
    }
}
