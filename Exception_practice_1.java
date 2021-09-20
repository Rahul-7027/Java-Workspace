package com.company;

public class Exception_practice_1 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("HAHA");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("HEHE");
        }
    }
}
