package com.company;

public class Method_Of_String {
    public static void main(String[] args) {
        String a="Rahul";
//        System.out.println(a.length());
//        System.out.println(a.toUpperCase());
//        System.out.println(a.toLowerCase());
//        String name="         rahul         ";
//        System.out.println(name.trim());
//        System.out.println(a.substring(0));
//        System.out.println(a.substring(0,3));
//        System.out.println(a.replace("R","H"));
//        System.out.println(a.startsWith("R"));
//        System.out.println(a.endsWith("l"));
//        System.out.println(a.charAt(2));
//        System.out.println(a.indexOf("l"));
//        System.out.println(a.indexOf("h",2));
        System.out.println(a.lastIndexOf("l"));
        System.out.println(a.lastIndexOf("l",4));
        System.out.println(a.equals("Rahul"));
        System.out.println(a.equalsIgnoreCase("rahul"));
    }
}
