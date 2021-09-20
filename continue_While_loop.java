package com.company;

public class continue_While_loop {
    public static void main(String[] args) {
        int i=1;
        while (i<=10)
        {
            System.out.println(i);
            System.out.println("Java is Great");
            i++;
            if (i==5)
            {
                continue;
            }

            System.out.println("Continue the Java Loop");

        }
    }
}
