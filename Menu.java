import java.util.Scanner;
/**
 * Esta clase representa el menú de opciones para interactuar con el sistema de compra de boletos.
 */
public class Menu {
    /**
     * Muestra el menú de opciones y gestiona las interacciones del usuario.
     *
     * @param localidad La instancia de Localidad utilizada para gestionar la disponibilidad y compra de boletos.
     * @param in El objeto Scanner para recibir entradas del usuario.
     */
    public void mostrarMenu(Localidad localidad, Scanner in) {
        System.out.println("Bienvenido a la compra de boletos para Eras Tour");
        
        boolean salir = false;
        while (!salir) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1: Nuevo Comprador");
            System.out.println("2: Nueva solicitud de boletos");
            System.out.println("3: Consultar Disponibilidad total");
            System.out.println("4: Consultar Disponibilidad individual");
            System.out.println("5: Reporte de caja");
            System.out.println("6: Codigo especial");
            System.out.println("7: Salir");
            int opcion = in.nextInt();

            switch (opcion) {
                
                case 1:
                    Comprador comprador = new Comprador();
                    comprador.informacion();
                    break;
                case 2:
                    realizarCompraNormal(localidad, in);
                    break;
                case 3:
                    int espaciosDisponiblesTotal = localidad.obtenerEspaciosDisponibles("Localidad 1") +
                    localidad.obtenerEspaciosDisponibles("Localidad 5") +
                    localidad.obtenerEspaciosDisponibles("Localidad 10");
                    System.out.println("La disponibilidad total de boletos es: " + espaciosDisponiblesTotal);
                    break;
                case 4:
                    System.out.println("Espacios disponibles localidad 1: "+ localidad.obtenerEspaciosDisponibles("Localidad 1"));
                    System.out.println("Espacios disponibles localidad 5: "+ localidad.obtenerEspaciosDisponibles("Localidad 5"));
                    System.out.println("Espacios disponibles localidad 10: "+ localidad.obtenerEspaciosDisponibles("Localidad 10"));
                    break;
                case 5:
                    System.out.println("Ingresos generados: $" + localidad.obtenerIngresosGenerados());
                    
                    break;
                case 6:
                    realizarCompraEspecial(localidad, in);
                    break;
                case 7:
                    System.out.println("¡Gracias por usar el sistema de boletos!");
                    salir = true;
                    break; // Salir del programa
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }
    }

    private void realizarCompraNormal(Localidad localidad, Scanner in) {
        Comprador comprador = new Comprador();
        comprador.informacion();

        localidad.localidadAleatoria(comprador); // Seleccionar una localidad aleatoria
        // Verificar si el ticket es válido para la compra de boletos
        if (!comprador.getTicket().isValidForPurchase()) {
            System.out.println("Lo sentimos, el ticket no es valido para esta compra.");
            return;
        }
        localidad.comprarBoleto(comprador.getCantBoletos(), comprador.getPresupuesto());
    }
    

    private void realizarCompraEspecial(Localidad localidad, Scanner in) {
        System.out.println("Ingrese el código especial:");
        int codigoEspecial = in.nextInt();

        CodigoEspecial codigo = new CodigoEspecial(codigoEspecial);

        if (codigo.getCodigo() != 0) {
            System.out.println("¡Código especial válido!");

            // Implementar compra especial
            localidad.comprarBoletoEspecial(codigo);
        }
    }
}
