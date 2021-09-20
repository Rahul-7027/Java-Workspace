package com.company;

abstract class PhoneModel {
    abstract public void switches();
}
class SmartphoneModel extends PhoneModel{
    public void greet()
    {
        System.out.println("Hello ");
    }

    @Override
    public void switches() {
        System.out.println("Power off");
    }
}
public class abstraction_practice_1 {
    public static void main(String[] args) {
        SmartphoneModel s1=new SmartphoneModel();
        s1.greet();
        s1.switches();
    }
}
