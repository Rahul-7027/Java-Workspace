package com.company;
class Monkey1
{
    public void jump()
    {
        System.out.println("Jumping ....");
    }
    public void bite()
    {
        System.out.println("Bite the apple");
    }
}
interface BasicAnimal1
{
    public void eat();
    public void sleep();
}

class Human1 extends Monkey1 implements BasicAnimal1
{
    public void music()
    {
        System.out.println("Play music ....");
    }
    @Override
    public void eat() {
        System.out.println("Eat the food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping ...");
    }
}
public class abstract_practice_6 {
    public static void main(String[] args) {
        Monkey1 m1=new Human1();
        m1.bite();
        m1.jump();

    }
}
