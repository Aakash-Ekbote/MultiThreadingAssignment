package ThreadMethods;

public class MyThreadClass extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread Name is :"+ Thread.currentThread().getName()+" value :"+i);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

