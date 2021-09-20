package com.company;

class Circle1
{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    int area()
    {
        return (int) (2*Math.PI*radius*radius);
    }
    int perimeter()
    {
        return (int) (2*Math.PI*radius);
    }
}
public class getter_setter_1 {
    public static void main(String[] args) {
        Circle1 c1=new Circle1();
        c1.setRadius(10);
        System.out.println("The radius is : "+c1.getRadius());
        System.out.println("the area of circle : "+c1.area());
        System.out.println("the perimeter of circle : "+c1.perimeter());

    }
}
