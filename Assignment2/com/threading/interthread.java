package com.threading;

import java.util.Scanner;

public class interthread extends Thread{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Bank obj=new Bank();
        new Thread()
        {
            public void run()
            {
                obj.withdraw();
            }
        }.start();
        new Thread()
        {
            public void run()
            {
                obj.deposit();
            }
        }.start();

    }
}
