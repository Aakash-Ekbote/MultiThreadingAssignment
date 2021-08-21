package Reservation;

public class TicketBooking extends Thread{
    private TicketCounter ticketCounter;
    private String name;
    private int seatcnt;

    public TicketCounter getTicketCounter() {
        return ticketCounter;
    }

    public void setTicketCounter(TicketCounter ticketCounter) {
        this.ticketCounter = ticketCounter;
    }

    public TicketBooking(TicketCounter ticketCounter, String name, int seatcnt) {
        this.ticketCounter = ticketCounter;
        this.name = name;
        this.seatcnt = seatcnt;
    }
    @Override
    public void run()
    {
        boolean flag=ticketCounter.bookTicket(name,seatcnt);
        if(!flag)
        {
            System.out.println("Seats full Closing application");
            System.exit(0);
        }

    }
}
