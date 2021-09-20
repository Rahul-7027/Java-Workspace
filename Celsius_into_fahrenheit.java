package com.company;

import java.util.Scanner;

public class Celsius_into_fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Celsius : ");
        float Fahrenheit,celsius;
            celsius=sc.nextInt();
            Fahrenheit=((celsius*9)/5)+32;
            System.out.println("The fahrenheit is : "+Fahrenheit);
    }
}
