package com.company;
interface TVRemote
{
    public void ChangeChannel();
    public void Game();
}
interface  SmartTvRemote
{
    public void wireless();
}
class Tv implements TVRemote,SmartTvRemote
{
    @Override
    public void ChangeChannel() {
        System.out.println("Change the channel ");
    }

    @Override
    public void Game() {
        System.out.println("Play music ");
    }

    @Override
    public void wireless() {
        System.out.println("Wireless technology ...");
    }
}
public class Interface_practice_1 {
    public static void main(String[] args) {
        Tv t1=new Tv();
        t1.wireless();
        t1.Game();
        t1.ChangeChannel();
    }
}
