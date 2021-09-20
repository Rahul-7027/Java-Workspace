package com.company;

public class Continue_for_loop {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            System.out.println(i);
            if (i==2)
            {
                continue;
            }
            System.out.println("Continue the Java Loop");
        }
    }
}
