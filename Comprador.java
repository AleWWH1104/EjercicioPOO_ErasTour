import java.util.Scanner;

/**
 * Esta clase representa un comprador que interactúa con el sistema de compra de boletos.
 */
public class Comprador {
    private String nombre;
    private String email;
    private Integer cant_boletos;
    private Double presupuesto;
    private Ticket ticket;
    private String localidadSeleccionada;

    /**
     * Constructor de la clase Comprador que inicializa una instancia de Ticket.
     */
    public Comprador() {
        ticket = new Ticket();
    }

    /**
     * Obtiene la localidad seleccionada por el comprador.
     *
     * @return La localidad seleccionada por el comprador.
     */
    public String getLocalidadSeleccionada() {
        return localidadSeleccionada;
    }

    /**
     * Establece la localidad seleccionada por el comprador.
     *
     * @param localidadSeleccionada La localidad seleccionada por el comprador.
     */
    public void setLocalidadSeleccionada(String localidadSeleccionada) {
        this.localidadSeleccionada = localidadSeleccionada;
    }

    /**
     * Solicita al comprador que ingrese su información.
     */
    public void informacion() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = in.nextLine();
        System.out.println("Ingrese su email:");
        email = in.nextLine();
        System.out.println("Ingrese la cantidad de boletos a comprar:");
        cant_boletos = in.nextInt();
        System.out.println("Ingrese su presupuesto:");
        presupuesto = in.nextDouble();
    }

    // Getters para los atributos del comprador
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public Integer getCantBoletos() {
        return cant_boletos;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    /**
     * Obtiene el ticket asociado al comprador.
     *
     * @return El ticket asociado al comprador.
     */
    public Ticket getTicket() {
        return ticket;
    }
}
