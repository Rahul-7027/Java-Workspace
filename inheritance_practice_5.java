package com.company;

class Base21{
    public Base21() {
        System.out.println("I am a base constructor");
    }
    public Base21(int x)
    {
        System.out.println("I am a base constructor : "+x);
    }
}
class Derived22 extends Base21
{
    public Derived22() {
        System.out.println("I am derived 22 class constructor");
    }

    public Derived22(int x,int y) {
        super(x);
        System.out.println("I am derived 22 class constructor : "+y);
    }
}
class Derived23 extends Derived22
{
    public Derived23() {
        System.out.println("I am derived 23 constructor");
    }

    public Derived23(int x, int y,int z) {
        super(x, y);
        System.out.println("I am derived 23 constructor : "+z);
    }
}
public class inheritance_practice_5 {
    public static void main(String[] args) {
        Derived23 d2=new Derived23(12,21,32);

    }
}
