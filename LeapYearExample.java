package com.company;

import java.util.Scanner;

public class LeapYearExample {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Please Enter Your Year : ");
        int year=SC.nextInt();
        if (((year%4==0)&& (year % 100 !=0)) || (year % 400==0))
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("COMMON YEAR");
        }
    }
}
