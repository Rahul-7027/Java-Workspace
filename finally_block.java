package com.company;

public class finally_block {
    public static int greet()
    {
        try {
            int a=20;
            int b=2;
            int c=a/b;
            return c;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("End of this program ");
        }

        return 0;
    }
    public static void main(String[] args) {
        greet();
    }
}
