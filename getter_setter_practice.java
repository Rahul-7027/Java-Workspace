package com.company;

class Cylinder
{
    private int radius;
    private int height;

    int area()
    {
        return (int) (2*Math.PI*radius*height+2*Math.PI*radius*radius);
    }

    int perimeter()
    {
        return (int) (2*Math.PI*radius*height);
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
public class getter_setter_practice {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.setRadius(12);
        c1.setHeight(10);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
