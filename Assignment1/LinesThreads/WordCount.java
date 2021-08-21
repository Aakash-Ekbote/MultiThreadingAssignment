package LinesThreads;

import java.util.Arrays;

public class WordCount extends Thread{
    public String arr[];

    static int totalcnt=0;
    WordCount(){}
    WordCount(String arr[])
    {
        this.arr=arr;
    }
    synchronized void countWords()
    {
        System.out.println(Thread.currentThread().getName());
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            String temp[]=arr[i].split(" ");
            totalcnt+=temp.length;
        }
        //System.out.println(totalcnt);
    }
    public void run()
    {
        countWords();
    }
}
