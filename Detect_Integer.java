package com.company;

import java.util.Scanner;

public class Detect_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number ");
        boolean a=sc.hasNextInt();
        System.out.println(a);
    }
}
