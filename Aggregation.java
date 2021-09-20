package com.company;

class Emp{
    int id;
    String name;
    String address;

    public Emp(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void printdetail() {
    System.out.println("This id is : "+id +" this name is : "+name+" and address is :"+address);
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Emp e1=new Emp(12,"rahul","balai");
        e1.printdetail();
    }
}
