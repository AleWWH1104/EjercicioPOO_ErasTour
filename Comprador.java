import java.util.Scanner;

public class Comprador {
    //Declaracion de variables 
    public String nombre;
    public String email;
    public Integer cant_boletos;
    public Double presupuesto;

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

    
}

