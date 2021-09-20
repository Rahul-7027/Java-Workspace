package com.company;

class Employees
{
    int id;
    String name;
    public void printable()
    {
        System.out.println("The id is "+id);
        System.out.println("and name is "+name);
    }
}
public class custom_class {
    public static void main(String[] args) {
        Employees e1=new Employees();
        e1.id=19;
        e1.name="rahul";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.printable();
    }
}
