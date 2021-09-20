package com.company;

import java.util.Scanner;

class MyThr extends Exception
{
    @Override
    public String toString() {
        return "I am toString";
    }

    @Override
    public String getMessage() {
        return "I am getMessage";
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
public class Exception_Class {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int ind=sc.nextInt();
        if (ind<9)
        {
            try {
                throw new ArithmeticException();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }
}
