package com.company;

public class mathfloor_div {
    public static void main(String[] args) {
//        int a=Math.floorDiv(10,3);
//        System.out.println(a);



        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        int l= arr.length;
        int a=Math.floorDiv(l,2);
        int temp;

        for (int i = 0; i < a; i++) {
//            swap two number
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for (int element:arr) {
            System.out.println(element+" ");
        }
    }
}
