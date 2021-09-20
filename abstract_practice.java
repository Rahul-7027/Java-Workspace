package com.company;

abstract class Parent{
    public void say()
    {
        System.out.println("Hello");
    }
    abstract public void greet();
}
class son extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}
public class abstract_practice {
    public static void main(String[] args) {
        son s1=new son();
        s1.greet();
        s1.say();
    }
}
