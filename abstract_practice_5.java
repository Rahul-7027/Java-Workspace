package com.company;

abstract class TelePhone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone1 extends TelePhone{
    @Override
    void ring() {
        System.out.println("Ringing ....");
    }

    @Override
    void disconnect() {
        System.out.println("disconnect the call");
    }

    @Override
    void lift() {
        System.out.println("Lifting ...");
    }
}
public class abstract_practice_5 {
    public static void main(String[] args) {
        SmartPhone1 s1=new SmartPhone1();
        s1.disconnect();
        s1.lift();
        s1.ring();
    }
}
