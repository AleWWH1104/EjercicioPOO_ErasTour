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

    // Con ayuda de chat
    // Tengo que comprobar si el ticket es valido para ser comprado si esta en el rango, como lo puedo implementar en mi clase Ticket?
    public boolean isValidForPurchase() {
        Random rand = new Random();
        int a = rand.nextInt(15000) + 1;
        int b = rand.nextInt(15000) + 1;

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        return isTicketValid(min, max);
    }
}
