package com.company;

public class break_do_while_loop {
    public static void main(String[] args) {
        int i=1;
        do {
            System.out.println(i);
            System.out.println("Java is Great ");
            if (i==3)
            {
                break;
            }
            i++;

        }
        while (i<10);
        System.out.println("Ending of this loop");
    }
}
