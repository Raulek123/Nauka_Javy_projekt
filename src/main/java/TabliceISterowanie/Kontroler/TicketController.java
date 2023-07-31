package TabliceISterowanie.Kontroler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TicketController {

    public static void main(String[] args) {
        TicketMachine ticketMachine = new TicketMachine();
        Passenger[] passengers = new Passenger[5];
        passengers[0] = new Passenger("Jan", "Kowalski");
        passengers[1] = new Passenger("Ada", "Zambrowska");
        passengers[2] = new Passenger("Arian", "Brzęczek");
        passengers[3] = new Passenger("Maksymilian", "Orłoś");
        passengers[4] = new Passenger("Wioletta", "Piasecka");

        ticketMachine.buyTicket(passengers[0], 60);
        ticketMachine.buyTicket(passengers[1], 120);
        ticketMachine.buyTicket(passengers[2], 30);
        Ticket ticketValid = new Ticket(LocalDateTime.now().minusMinutes(30), 15);
        passengers[3].setTicket(ticketValid);

        Passenger[] passengers1 = validateTickets(passengers);
        for (Passenger passenger : passengers1) {
            System.out.println(passenger);
        }


    }

    private static Passenger[] validateTickets(Passenger[] passengers) {
        int passengersWithoutTicket = 0;
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if(ticket == null || !ticket.isValid())
                passengersWithoutTicket++;
        }

        Passenger[] withoutTicket = new Passenger[passengersWithoutTicket];
        for (int i = 0, j = 0; i < passengers.length; i++) {
            Ticket ticket = passengers[i].getTicket();
            if(ticket == null || !ticket.isValid()) {
                withoutTicket[j] = passengers[i];
                j++;
            }
        }

        return withoutTicket;
    }
}
