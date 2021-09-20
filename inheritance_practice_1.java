package com.company;

class circle {
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int area() {
        return (int) (Math.PI * radius * radius);
    }
}
class cylinder extends circle{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int perimeter()
    {
        return (int) (2*Math.PI*radius*height);
    }
}
public class inheritance_practice_1 {
    public static void main(String[] args) {
        cylinder c1=new cylinder();
        c1.setRadius(10);
        c1.setHeight(12);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
