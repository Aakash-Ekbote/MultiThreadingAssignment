package LinesThreads;

import java.util.ArrayList;
import java.util.Scanner;

public class CountLineswith5Threads {
    public static  void main(String args[]) throws Exception
    {
        double start=System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
        int n=30;
        ArrayList<String> al=new ArrayList<>();
        System.out.println("Enter the strings");
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextLine());
        }
        int nt=n/5;
        //String w[]=new String[nt];
        ArrayList<String[]> res=new ArrayList<>();
        for(int i=0;i<=n-nt;i+=nt)
        {
            res.add(al.subList(i, i + nt).toArray(new String[0]));
        }
        //System.out.println(res.size());

        WordCount t1,t2,t3,t4,t5;
        t1=new WordCount(res.get(0));
        t1.setName("thread 1");
        t2=new WordCount(res.get(1));
        t2.setName("thread 2");
        t3=new WordCount(res.get(2));
        t3.setName("thread 3");
        t4=new WordCount(res.get(3));
        t4.setName("thread 4");
        t5=new WordCount(res.get(4));
        t5.setName("thread 5");

        t1.start();t2.start();t3.start();t4.start();t5.start();
        t1.join();t2.join();t3.join();t4.join();t5.join();
        double end=System.currentTimeMillis();
        System.out.println("total time taken ="+(end-start)+"milli second(s)");
        System.out.println(WordCount.totalcnt);
    }

}
