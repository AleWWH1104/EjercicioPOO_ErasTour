import java.util.Random;

public class Ticket {
    private int ticketNumber;

    public Ticket() {
        generateTicketNumber();
    }

    private void generateTicketNumber() {
        Random rand = new Random();
        ticketNumber = rand.nextInt(15000) + 1;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public boolean isTicketValid(int min, int max) {
        return (min <= ticketNumber && ticketNumber <= max);
    }
}
