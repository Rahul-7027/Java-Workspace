package com.company;

class Rectangle3 {
    public int length;
    public int width;

    public int area() {
        return length*width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
class Cuboid3 extends Rectangle3{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int perimeter()
    {
        return length*width*height;
    }
}
    public class inheritance_practice_4 {
    public static void main(String[] args) {
        Cuboid3 c3=new Cuboid3();
        c3.setLength(67);
        c3.setWidth(10);
        c3.setHeight(12);
        System.out.println(c3.area());
        System.out.println(c3.perimeter());
    }
}
