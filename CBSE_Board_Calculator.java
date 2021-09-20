package com.company;

import java.util.Scanner;

public class CBSE_Board_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your English Marks : ");
        int English=sc.nextInt();
        System.out.println("Enter Your Physics Marks : ");
        int Physics=sc.nextInt();
        System.out.println("Enter Your Math Marks : ");
        int Math=sc.nextInt();
        System.out.println("Enter Your Chemistry Marks : ");
        int Chemistry=sc.nextInt();
        System.out.println("Enter Your Hindi Marks : ");
        int Hindi=sc.nextInt();
        float percentage = ((Physics+Math+Chemistry+English+Hindi)/500.0f)*100;
        System.out.println("Total Percentage : "+percentage);
    }
}
