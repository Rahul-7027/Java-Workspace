package com.company;

public class Logical_Complex {
    static int logic(int x,int y)
    {
        int z;
        if (x>y)
        {
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=2;
        int b=6;
        int c=logic(a,b);
        System.out.println(c);
    }
}
