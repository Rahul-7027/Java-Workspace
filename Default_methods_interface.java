package com.company;

interface MyCamera{
    void takeShot();
    void record4k();
}
interface MyWifi
{
    String [] getnetworks();
    void connectToNetwork(String network);
}

class MyCellPhone
{
    void CallNumber(int phonenumber)
    {
        System.out.println("Calling "+phonenumber);
    }
    void PickCall()
    {
        System.out.println("Calling with friend .....");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi
{
    @Override
    public void takeShot() {
        System.out.println("Click photo");
    }

    @Override
    public void record4k() {
        System.out.println("Recording 4k video");
    }

    @Override
    public String[] getnetworks() {
        System.out.println("Show network list");
        String[] networkList={"rahul","harry","anjali5g","neha"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting "+network+" wifi ......");
    }
}
public class Default_methods_interface {
    public static void main(String[] args) {
        MySmartPhone s1=new MySmartPhone();
        s1.record4k();
        s1.connectToNetwork("neha");
        s1.CallNumber(23403004);
        s1.PickCall();
        String[] arr=s1.getnetworks();
        for (String item:arr) {
            System.out.println(item);
        }
    }
}
