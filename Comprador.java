import java.util.Scanner;

public class Comprador {
    private String nombre;
    private String email;
    private Integer cant_boletos;
    private Double presupuesto;

<<<<<<< HEAD
    // variable para ticket
    private Ticket ticket;
=======
    private Ticket ticket;
    

>>>>>>> 44491cb40c621cfbc15d5d1b4fd9321ee6f25133
    public Comprador() {
        ticket = new Ticket();
    }

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

    // getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    // instancia de ticket
    ticket = new Ticket();
    public Integer getCantBoletos() {
        return cant_boletos;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
