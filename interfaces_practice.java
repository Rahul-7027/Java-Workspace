package com.company;

interface cycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements cycle
{
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speed increase");
    }
}
public class interfaces_practice {
    public static void main(String[] args) {
        AvonCycle c1=new AvonCycle();
        c1.applyBrake(12);
        c1.speedUp(12);
    }
}
