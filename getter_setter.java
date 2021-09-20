package com.company;

class Employees2
{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class getter_setter {
    public static void main(String[] args) {
        Employees2 e2=new Employees2();
        e2.setId(18);
        e2.setName("Rahul");
        System.out.println(e2.getId());
        System.out.println(e2.getName());
    }
}
