package com.company;

class MyMainEmployees{
    private int id;
    private String name;

    public MyMainEmployees(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    public MyMainEmployees() {
//        this.id = 0;
//        this.name = "Your-name-here";
//    }
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class constructor {
    public static void main(String[] args) {
        MyMainEmployees m1=new MyMainEmployees(32,"Rahul");
//        m1.setId(12);
//        m1.setName("Rahul");
        System.out.println(m1.getId());
        System.out.println(m1.getName());
    }
}
