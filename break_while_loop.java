package com.company;

public class break_while_loop {
    public static void main(String[] args) {
        int i=1;
        while (i<=10)
        {
            System.out.println(i);
            System.out.println("Java is Great");
            if (i==4)
            {
                break;
            }
            i++;
        }
        System.out.println("Ending the Loop");

    }
}
