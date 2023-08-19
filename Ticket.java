import java.util.Random;

/**
 * Esta clase representa un ticket con un número aleatorio asociado.
 */
public class Ticket {
    private int ticketNumber;

    /**
     * Constructor que genera un número aleatorio para el ticket.
     */
    public Ticket() {
        generateTicketNumber();
    }

    /**
     * Genera un número aleatorio y lo asigna como número de ticket.
     */
    private void generateTicketNumber() {
        Random rand = new Random();
        ticketNumber = rand.nextInt(15000) + 1;
    }

    /**
     * Obtiene el número del ticket.
     *
     * @return El número del ticket.
     */
    public int getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Verifica si el número del ticket es válido dentro del rango especificado.
     *
     * @param min El valor mínimo del rango.
     * @param max El valor máximo del rango.
     * @return true si el número del ticket es válido, false de lo contrario.
     */
    public boolean isTicketValid(int min, int max) {
        return (min <= ticketNumber && ticketNumber <= max);
    }

    /**
     * Verifica si el ticket es válido para ser comprado dentro de un rango aleatorio.
     *
     * @return true si el ticket es válido para la compra, false de lo contrario.
     * 
     * Con ayuda de chat
     * Prompt: Tengo que comprobar si el ticket es valido para ser comprado si esta en el rango, como lo puedo implementar en mi clase Ticket?
     */
    public boolean isValidForPurchase() {
        Random rand = new Random();
        int a = rand.nextInt(15000) + 1;
        int b = rand.nextInt(15000) + 1;

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        return isTicketValid(min, max);
    }
}
