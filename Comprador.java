public class Comprador {
    //Declaracion de variables 
    private String nombre;
    private String email;
    private Integer cant_boletos;
    private Double presupuesto;

<<<<<<< HEAD
    // variable para ticket
    private Ticket ticket;

    public void informacion(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
		nombre = in.nextLine();
		System.out.println("Ingrese su email");
		email = in.nextLine();
        System.out.println("Ingrese la cantidad de boletos a comprar");
		cant_boletos = in.nextInt();
        System.out.println("Ingrese su presupuesto");
		presupuesto = in.nextDouble();
    }

    public Comprador(String nombre, String email, Integer cant_boletos, Double costoTotal, String localidadComprador) {
        this.nombre = nombre;
        this.email = email;
        this.cant_boletos = cant_boletos;
        this.costoTotal = costoTotal;
        this.localidadComprador = localidadComprador;

        // instancia de ticket
        ticket = new Ticket();
=======
    public Comprador(String nombre, String email, Integer cant_boletos) {
        this.nombre = nombre;
        this.email = email;
        this.cant_boletos = cant_boletos;
>>>>>>> 1db623092cf83736dc7923589e7bdc459c83cdd3
    }
    
}

