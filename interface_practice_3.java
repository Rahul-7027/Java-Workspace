package com.company;

interface DrawTable
{
    public void shape();
}
class Rectangle5 implements DrawTable
{
    @Override
    public void shape() {
        System.out.println("Draw Rectangle ...");
    }
}
class Circle5 implements DrawTable
{
    @Override
    public void shape() {
        System.out.println("draw circle");
    }
}
public class interface_practice_3 {
    public static void main(String[] args) {
        Rectangle5 r5=new Rectangle5();
        r5.shape();
    }
}
