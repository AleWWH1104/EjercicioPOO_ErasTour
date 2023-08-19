import java.util.Scanner;

public class DriverProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Localidad localidad = new Localidad();
        Menu menu = new Menu();

        //System.out.println("Menu");

        // con ayuda de chat
        // al usar el case 3, para salie no sale del ciclo del programa, como lo puedo corregir?
        boolean salir = false;
        while (!salir) {
            menu.mostrarMenu(localidad, in);
            System.out.println("¿Desea salir del programa? (si/no):");
            String respuesta = in.next();
            if (respuesta.equalsIgnoreCase("si")) {
                salir = true;
                System.out.println("¡Gracias por usar el sistema de boletos!");
            }
        }
    }

    public void MostrarMenu(){
        String opcion = "";
        do{
            System.out.println("Bienvenidx a la compra de Boletos de Eras Tour");
            System.out.println("Seleccione una opcion");
            System.out.println("1:Nuevo Comprador");
            System.out.println("2:Nueva solicitud de boletos");
            System.out.println("3:Consultar disponibilidad total");
            System.out.println("4:Consultar por localidad");
            System.out.println("5:Reporte de caja");
            System.out.println("6:Codigo especial");
            System.out.println("7:Salir del programa");

            Scanner in = new Scanner(System.in); 
			opcion = in.nextLine();
			
			if (opcion.equals("1")) {
				informacionComprador(in);
			} else if (opcion.equals("2")) {
				
			} else if (opcion.equals("3")) {
				
			} else if (opcion.equals("4")) {
				
			} else if (opcion.equals("5")) {
				ReporteDCaja();
			}else if (opcion.equals("6")) {
				
			}else if (opcion.equals("7")) {
				System.out.println("Gracias por utilizar el programa");
			}else {
				System.out.println("Opción no valida");
			}    
        } while(!opcion.equals("7"));
    }

    public void informacionComprador(Scanner in){
        System.out.println("Ingrese su nombre");
		String nombre = in.nextLine();
		System.out.println("Ingrese su email");
		String email = in.nextLine();
        System.out.println("Ingrese la cantidad de boletos a comprar");
		Integer cant_boletos = in.nextInt();
        System.out.println("Ingrese su presupuesto");
		Double presupuesto = in.nextDouble();
    }

    private void ReporteDCaja(){
        Double ingresosGenerados = localidad.obtenerIngresosGenerados();
        System.out.println("Reporte de Caja");
        System.out.println("Ingresos generados: $" + ingresosGenerados);
    }
    public static void main(String[] args) {
        //SolicitarCompraBoleto solicitarBoleto = new SolicitarCompraBoleto();
        DriverProgram hola = new DriverProgram();
        hola.MostrarMenu();
    }

}
