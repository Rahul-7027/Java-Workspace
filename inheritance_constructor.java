package com.company;

class Base1{
    public Base1() {
        System.out.println("I am base class constructor");
    }
    public Base1(int x)
    {
        System.out.println("I am base1 class constructor : "+x);
    }
}
class Derived1 extends Base1{
    public Derived1() {
        System.out.println("I am a derived class constructor");
    }
    public Derived1(int x,int y)
    {
        super(x);
        System.out.println("I am overloaded constructor : "+y);
    }
}
class child extends Derived1{
    public child() {
        System.out.println("i am child class constructor");
    }

    public child(int x, int y,int z) {
        super(x, y);
        System.out.println("I am child derived class constructor : "+z);
    }
}
public class inheritance_constructor {
    public static void main(String[] args) {
//        Base1 b1=new Base1();
//        Derived1 d1=new Derived1(5,8);
        child c1=new child(2,4,3);

    }
}
