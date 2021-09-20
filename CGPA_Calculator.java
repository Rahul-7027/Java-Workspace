package com.company;

import java.util.Scanner;

public class CGPA_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your English Marks ");
        int English= sc.nextInt();
        System.out.println("Enter Your Hindi Marks ");
        int Hindi=sc.nextInt();
        System.out.println("Enter Your Chemistry Marks ");
        int Chemistry= sc.nextInt();
        float percentage=(English+Hindi+Chemistry)/3.0f;
        System.out.println("Total Percentage "+percentage);

//        float subject1 = 89;
//    float subject2 = 89;
//    float subject3 = 89;
//    float cgpa = (subject1 + subject2 +subject3)/30;
//    System.out.println(cgpa);
    }
}
