package com.threading;

public class Bank implements BI{
    int balance;
    Bank()
    {
        this.balance=1000;
    }
    @Override
    synchronized public void deposit()
    {
        try
        {
            this.balance+=1000;
            System.out.println("Successfully deposited Rs.1000");
            notify();


        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    @Override
    synchronized public void withdraw()
    {

            if(this.balance<1500)
            {
                System.out.println("Less balance");
                try {
                    wait();
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
            this.balance-=1500;
            System.out.println("New balance is"+this.balance);
    }
    @Override
    public int getBalance()
    {
        return this.balance;
    }

}

