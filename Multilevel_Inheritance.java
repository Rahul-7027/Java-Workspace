package com.company;

class Animal1
{
    public void eat()
    {
        System.out.println("Eating the food....");
    }
}
class Dog1 extends Animal1{
    public void bark()
    {
        System.out.println("Barking ........");
    }
}
class Cat1 extends Animal{
    public void weep()
    {
        System.out.println("Weeping ....");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Cat1 c1=new Cat1();
        c1.eat();
        c1.weep();
    }
}
