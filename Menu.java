import java.util.Scanner;

public class Menu {
    public void mostrarMenu(Localidad localidad, Scanner in) {
        System.out.println("Bienvenido a la compra de boletos para Eras Tour");
        
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1: Compra normal");
            System.out.println("2: Compra especial");
            System.out.println("3: Salir");

            int opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    realizarCompraNormal(localidad, in);
                    break;
                case 2:
                    realizarCompraEspecial(localidad, in);
                    break;
                case 3:
                    System.out.println("¡Gracias por usar el sistema de boletos!");
                    return; // Salir del programa
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }
    }

    private void realizarCompraNormal(Localidad localidad, Scanner in) {
        Comprador comprador = new Comprador();
        comprador.informacion();

        // Implementar la lógica de compra normal aquí usando el objeto 'localidad' y 'comprador'
    }

    private void realizarCompraEspecial(Localidad localidad, Scanner in) {
        System.out.println("Ingrese el código especial:");
        int codigoEspecial = in.nextInt();

        CodigoEspecial codigo = new CodigoEspecial(codigoEspecial);

        if (codigo.getCodigo() != 0) {
            System.out.println("¡Código especial válido!");

            // Implementar compra especial

    }
}
