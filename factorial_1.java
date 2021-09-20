package com.company;

public class factorial_1 {
    public static void main(String[] args) {
        int n=10;
        int fact=1;
        for (int i = 1; i <=n ; ++i) {
            fact*=i;
        }
        System.out.printf("Factorial is %d = %d ",n,fact);
    }
}
