package com.company;

abstract class Pen
{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen {
    public void changeNib()
    {
        System.out.println("change Nib");
    }
    @Override
    void write() {
        System.out.println("Write the pen");
    }

    @Override
    void refill() {
        System.out.println("Fill the refill");
    }
}
public class abstract_practice_3 {
    public static void main(String[] args) {
        FountainPen f1=new FountainPen();
        f1.refill();
        f1.write();
        f1.changeNib();
    }
}
