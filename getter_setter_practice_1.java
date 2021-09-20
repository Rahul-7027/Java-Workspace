package com.company;

class Cylinder1{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int volume(){
        return (int) (2*Math.PI*radius*radius*height);
    }
    int surfaces()
    {
        return (int) (2*Math.PI*radius*height+2*Math.PI*radius*radius);
    }
}
public class getter_setter_practice_1 {
    public static void main(String[] args) {
Cylinder1 c1=new Cylinder1();
c1.setHeight(10);
c1.setRadius(12);
        System.out.println(c1.volume());
        System.out.println(c1.surfaces());
    }
}
