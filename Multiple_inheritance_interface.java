package com.company;

interface Printable{
    void show();
}
interface Showable{
    void print();
}
class information implements Printable,Showable
{
    @Override
    public void show() {
        System.out.println("Show function ....");
    }

    @Override
    public void print() {
        System.out.println("Print detail ....");
    }
}
public class Multiple_inheritance_interface {
    public static void main(String[] args) {
        information i=new information();
        i.print();
        i.show();
    }
}
