package LinesThreads;

import java.util.ArrayList;
import java.util.Scanner;

public class CouthLinesWithThreads {
    public static  void main(String args[]) throws Exception
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of lines of  Strings");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Strings");
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextLine());
        }
        System.out.println("Enter no of threads");
        int no_of_threads=sc.nextInt();
        int nt=n/no_of_threads;
        ArrayList<String []> res=new ArrayList<>();
        for(int i=0;i<=n-nt;i+=nt) {
            res.add(al.subList(i, i + nt).toArray(new String[0]));
        }
        WordCount arr[]=new WordCount[no_of_threads];
        double start=System.currentTimeMillis();
        for(int i=0;i<no_of_threads;i++)
        {
            arr[i]=new WordCount(res.get(i));
            arr[i].start();
        }
        for(int i=0;i<no_of_threads;i++)
        {
            arr[i].join();
        }
        double end=System.currentTimeMillis();
        System.out.println("total time taken ="+(end-start)+" milli second(s)");
        System.out.println(WordCount.totalcnt);
}
}
