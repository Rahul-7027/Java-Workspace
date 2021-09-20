package com.company;

import java.util.Scanner;

public class Exception_practice_2 {
    public static void main(String[] args) {
        int[] arr={23,43,54,65,12,32};
        Scanner sc=new Scanner(System.in);
        boolean flag = true;
        int ind;
        int i=0;
        while (flag && i<5)
        {
            try {
                System.out.println("Enter the index ");
                ind=sc.nextInt();
                System.out.println("The value of arr[index] : "+arr[ind]);
                break;
            }
            catch (Exception e)
            {
                System.out.println("Invalid Index");
                i++;
            }
        }
    }
}
