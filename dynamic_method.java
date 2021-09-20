package com.company;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on()
    {
        System.out.println("Turning on the phone");
    }
}
class Smartphone extends Phone{
    public void music()
    {
        System.out.println("Play music");
    }

    @Override
    public void on() {
        System.out.println("Turning on smartphone");
    }
}
public class dynamic_method {
    public static void main(String[] args) {
        Phone s1=new Smartphone();
        s1.on();
        s1.showTime();
    }
}
