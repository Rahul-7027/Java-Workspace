package com.company;

import java.util.Scanner;

public class Handle_Specific_Exception {
    public static void main(String[] args) {
        int[] marks={21,32,43,54};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your index : ");
        int ind=sc.nextInt();

        System.out.println("Enter the number you want to divide with the value ");
        int num=sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException Occurred");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException Occurred");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
