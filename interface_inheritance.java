package com.company;

interface SampleInterface
{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface
{
    void meth3();
    void meth4();
}

class Mychild implements SampleInterface,ChildSampleInterface
{
    @Override
    public void meth1() {
        System.out.println("Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("Meth3");
    }

    @Override
    public void meth4() {
        System.out.println("Meth4");
    }
}
public class interface_inheritance {
    public static void main(String[] args) {
        Mychild c1=new Mychild();
        c1.meth1();
        c1.meth2();
        c1.meth3();
        c1.meth4();



    }
}
