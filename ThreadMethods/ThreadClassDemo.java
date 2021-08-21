package ThreadMethods;

import java.security.spec.ECField;

public class ThreadClassDemo {
    public static void main(String args[]) throws Exception
    {
        MyThreadClass t1=new MyThreadClass();
        MyThreadClass t2=new MyThreadClass();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        try
        {
            t1.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
      t2.start();
        t2.join();
        MyThreadClass2 t3=new MyThreadClass2();
        MyThreadClass2 t4=new MyThreadClass2();
        t3.setName("Thread 3");

        t3.setPriority(Thread.MAX_PRIORITY);

        t3.start();
        t4.setName("Thread 4");t4.start();


    }
}
