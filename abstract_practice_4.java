package com.company;

interface BasicAnimal
{
    public void eat();
    public void sleep();
}
class Monkey
{
    public void jump()
    {
        System.out.println("Jumping the tree");
    }
    public void bite()
    {
        System.out.println("Bite teh apple");
    }
}

class Human extends Monkey implements BasicAnimal
{
    @Override
    public void eat() {
        System.out.println("Eating the food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep the human");
    }
}
public class abstract_practice_4 {
    public static void main(String[] args) {
        Human h1=new Human();
        h1.eat();
        h1.sleep();
        h1.bite();
        h1.jump();
    }
}
