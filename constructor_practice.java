package com.company;

class Rectangle1{
    int width;
    int length;

    public Rectangle1(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle1() {
        this.width = 5;
        this.length = 4;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int area()
    {
        return length*width;
    }
}
public class constructor_practice {
    public static void main(String[] args) {
        Rectangle1 r1=new Rectangle1();
        System.out.println(r1.area());


    }
}
