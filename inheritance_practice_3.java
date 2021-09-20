package com.company;

class Circle3{
    int radius=10;
    public int area() {
        return (int) (Math.PI * radius * radius);
    }
}
class Cylinder3 extends Circle3{
    int height=20;
    public int perimeter()
    {
        return (int) (2*Math.PI*radius*height);
    }
}
public class inheritance_practice_3 {
    public static void main(String[] args) {
        Cylinder3 c1=new Cylinder3();
        System.out.println(c1.perimeter());
        System.out.println(c1.area());
    }
}

