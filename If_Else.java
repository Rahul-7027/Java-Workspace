package com.company;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age=sc.nextInt();
        if (age>18)
        {
            System.out.println("Yes You can Drive");
        }
        else
        {
            System.out.println("No You can't Drive");
        }
    }
}
