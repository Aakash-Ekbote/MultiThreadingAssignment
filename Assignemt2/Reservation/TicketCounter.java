package Reservation;

public class TicketCounter {
    int totalcount=10;

    public synchronized boolean isValid(int seatcnt)
    {
        return ((totalcount>=seatcnt)&&(seatcnt>0));
    }

    public synchronized boolean bookTicket(String name,int seatcnt)
    {
        if(isValid(seatcnt))
        {
            System.out.println("Hello !"+name+"your"+seatcnt+"are booked successfully");
            totalcount-=seatcnt;
            getCnt();
            return true;
        }
        else if(totalcount==0)
        {
            return false;
        }
        else if(seatcnt>=totalcount)
        {
            System.out.println("Available seats are "+totalcount);
            System.out.println("Trying to book too many seats");
            return true;
        }

        return false;
    }
    public void getCnt()
    {
        System.out.println("Seats remaining are "+totalcount);
    }
}
