package com.company;

class Cylinder2{
    private int radius;
    private int height;

    public Cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

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
public class getter_setter_practice_2 {
    public static void main(String[] args) {
        Cylinder2 c2=new Cylinder2(10,12);
        System.out.println(c2.surfaces());
        System.out.println(c2.volume());
    }
}
