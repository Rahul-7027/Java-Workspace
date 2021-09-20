package com.company;

public class Fibonacci {
    static int fab(int n)
    {
        if (n==1 || n==2)
        {
            return n-1;
        }
        else {
            return fab(n-1)+fab(n-2);
        }
    }
    public static void main(String[] args) {
        int result=fab(8);
        System.out.println("The value of fab is "+result);
    }
}
