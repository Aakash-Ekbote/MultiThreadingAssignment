package Reservation;

import java.util.Scanner;

public class BookMain {
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        TicketCounter obj=new TicketCounter();
       TicketBooking t1=new TicketBooking(obj,"Aakash",5);
       TicketBooking t2=new TicketBooking(obj,"suresh",3);
       TicketBooking t3=new TicketBooking(obj,"harish",1);
        TicketBooking t4=new TicketBooking(obj,"mm",7);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();

    }
}
