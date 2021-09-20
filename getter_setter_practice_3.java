package com.company;

class Circle2{
    private int radius;
    public int height;

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
}
public class getter_setter_practice_3 {
    public static void main(String[] args) {
        Circle2 c2=new Circle2();
        c2.setHeight(10);
        c2.setRadius(12);
        System.out.println(c2.getHeight());
        System.out.println(c2.getRadius());
    }
}
