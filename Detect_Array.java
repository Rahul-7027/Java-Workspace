package com.company;

import java.util.Scanner;

public class Detect_Array {
    public static void main(String[] args) {
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Valid marks : ");
        float num=sc.nextFloat();
        boolean isArray=false;
        for (float element:marks) {
            if (num==element)
            {
                isArray=true;
                break;
            }
        }
            if (isArray)
            {
                System.out.println("The value is present in the array");
            }
            else {
                System.out.println("The value is not present in the array");
            }
    }
}
