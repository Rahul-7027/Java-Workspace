package com.company;

class Rectangle2 {
    public int length = 10;
    public int width = 20;

    public int area() {
        return length*width;
    }
}
class Cuboid2 extends Rectangle2{
    public int height=10;
    public int perimeter()
    {
        return length*width*height;
    }
}
public class inheritance_practice_2 {
    public static void main(String[] args) {
        Cuboid2 c1=new Cuboid2();
        System.out.println(c1.perimeter());
        System.out.println(c1.area());
    }
}
