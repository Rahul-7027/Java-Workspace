package com.company;

abstract class Shape{
    int length=10;
    int width=10;
    int radius=10;
    abstract int area();
    abstract int perimeter();
}
class Rectangle4 extends Shape
{
    @Override
    int perimeter() {
        return 2*(length+width);
    }

    @Override
    int area() {
        return length*width;
    }
}
class Circle4 extends Shape{
    @Override
    int area() {
        return (int) (2*Math.PI*radius*radius);
    }

    @Override
    int perimeter() {
        return (int) (2*Math.PI*radius);
    }
}
public class abstraction_practice_2 {
    public static void main(String[] args) {
        Rectangle4 r4=new Rectangle4();
        System.out.println(r4.area());
        System.out.println(r4.perimeter());

        Circle4 c4=new Circle4();
        System.out.println(c4.area());
        System.out.println(c4.perimeter());
    }
}
