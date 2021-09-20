package com.company;

import java.util.Scanner;

public class Exception_practice_3 {
    public static void main(String[] args) {
        int[] arr={23,43,54,65,12,32};
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        int i=0;
        int ind;
        while (flag && i<5)
        {
            try {
                System.out.println("Enter the index : ");
                ind=sc.nextInt();
                System.out.println("The arr value of index : "+arr[ind]);
                break;
            }
            catch (Exception e)
            {
                System.out.println(e);
                i++;
            }

        if (i>5)
        {
            System.out.println("Error ....");
        }
    }
    }
}
