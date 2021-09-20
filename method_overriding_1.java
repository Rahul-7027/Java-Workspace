package com.company;

class Vehicle
{
    public void run()
    {
        System.out.println("Vehicle running safely");
    }
}
class Bike extends Vehicle{
    public void run()
    {
        System.out.println("Bike is running safely");
    }
}
public class method_overriding_1 {
    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.run();
    }
}
