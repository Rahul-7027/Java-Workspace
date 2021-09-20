package com.company;

public class break_for_loop {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
            System.out.println("Java is Great");
            if (i==2)
            {
                break;
            }
        }
        System.out.println("Ending the Loop");
    }
}
