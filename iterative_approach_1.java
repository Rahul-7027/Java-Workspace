package com.company;

public class iterative_approach_1 {
    static int iterative(int n)
    {
        if (n==0 || n==1)
        {
            return 1;
        }
        else
        {
            int product=1;
            for (int i = 1; i <=n; i++) {
                product*=i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int result=iterative(10);
        System.out.println(result);
    }
}
