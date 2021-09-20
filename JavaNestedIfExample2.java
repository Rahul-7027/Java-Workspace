package com.company;

public class JavaNestedIfExample2 {
    public static void main(String[] args) {
        int age=20;
        int weight=43;
        if (age>=18) {
            if (weight > 46) {
                System.out.println("You eligible to denote blood");
            } else {
                System.out.println("You are not eligible to denote blood");
            }
        }
            else
            {
                System.out.println("Age must be grater than 18");
            }
        }
    }
