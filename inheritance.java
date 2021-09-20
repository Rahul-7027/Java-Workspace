package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am Base constructor in java");
        this.x = x;
    }
}
class Derived extends Base
{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        Derived d1=new Derived();
        d1.setX(20);
        System.out.println(d1.getX());
        d1.setY(23);
        System.out.println(d1.getY());
    }
}
