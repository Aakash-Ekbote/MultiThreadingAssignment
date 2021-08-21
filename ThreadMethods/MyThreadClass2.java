package ThreadMethods;

public class MyThreadClass2 extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread Name is :"+ Thread.currentThread().getName()+"Priority is: "+Thread.currentThread().getPriority()+" value :"+i);
        }
    }
}
