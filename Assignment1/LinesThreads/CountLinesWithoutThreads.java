package LinesThreads;

import java.util.ArrayList;
import java.util.Scanner;

public class CountLinesWithoutThreads {
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of strings");
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> al=new ArrayList<>();
        System.out.println("Enter the strings");
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextLine());
        }
        int totalcnt=0;
        double start=System.currentTimeMillis();
        for(int i=0;i<al.size();i++)
        {
            String temp[]=al.get(i).split(" ");
            totalcnt+= temp.length;
        }
        double end=System.currentTimeMillis();
        System.out.println("total time taken ="+(end-start)+" milli second(s)");
        System.out.println(totalcnt);
    }
}
