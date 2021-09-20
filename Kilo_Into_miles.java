package com.company;

import java.util.Scanner;

public class Kilo_Into_miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Kilometers ");
        double Kilometers= sc.nextDouble();
        double miles=Kilometers/1.6;
        System.out.println(miles+" Miles");
    }
}
