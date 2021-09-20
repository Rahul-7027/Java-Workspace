package com.company;

public class finally_block_for_loop {
    public static int block()
    {
        try {
            for (int i = 0; i <5; i++) {
                if (i==3)
                {
                    break;
                }
                System.out.println(i);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("End of this program for loop");
        }
        return 0;
    }
    public static void main(String[] args) {
        block();
    }
}
