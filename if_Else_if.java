package com.company;

import java.util.Scanner;

public class if_Else_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age=sc.nextInt();
        if (age>56)
        {
            System.out.println("You have a experience person");
        }
        else if (age>46)
        {
            System.out.println("You have a semi-experience person");
        }else if (age>36)
        {
            System.out.println("You have a semi-semi-experience person");
        }else {
            System.out.println("You have not experience person");
        }

    }
}
