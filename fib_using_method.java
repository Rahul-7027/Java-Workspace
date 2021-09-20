package com.company;

public class fib_using_method {
    static int fib(int n)
    {
        if (n==1 || n==2)
        {
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int result=fib(7);
        System.out.println(result);
    }
}
