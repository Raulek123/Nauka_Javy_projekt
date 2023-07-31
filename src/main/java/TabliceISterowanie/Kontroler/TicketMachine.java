package TabliceISterowanie.Kontroler;

import java.time.Duration;
import java.time.LocalDate;

public class TicketMachine {
    public void buyTicket(Passenger passenger, int timeTicket){
        Ticket ticket = new Ticket(timeTicket);
        passenger.setTicket(ticket);
    }
}
