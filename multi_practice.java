package com.company;

import java.util.Arrays;

public class multi_practice {
    public static void main(String[] args) {
        int[][] house=new int[3][4];
        house[0][0]=0;
        house[0][1]=1;
        house[0][2]=2;
        house[0][3]=3;
        house[1][0]=4;
        house[1][1]=5;
        house[1][2]=6;
        house[1][3]=7;
        house[2][0]=8;
        house[2][1]=9;
        house[2][2]=10;
        house[2][3]=11;
        System.out.println("Printing 2-D Array using 3*4");
        for (int i = 0; i < house.length ; i++) {
            for (int j = 0; j <house[i].length; j++) {
                System.out.print(house[i][j]);
                System.out.print(" ");
            }
            System.out.println( );
        }
    }
}
