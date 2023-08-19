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
}
