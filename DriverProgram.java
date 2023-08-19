import java.util.Scanner;

/**
 * Esta clase contiene el programa principal que permite interactuar con el usuario
 * para mostrar un menú de opciones relacionadas con una localidad.
 */
public class DriverProgram {
    /**
     * El método principal que inicia la ejecución del programa.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Crear una instancia de la clase Localidad para manejar la información de la localidad.
        Localidad localidad = new Localidad();

        // Crear una instancia de la clase Menu para manejar la interacción del menú con el usuario.
        Menu menu = new Menu();

        // Mostrar el menú y permitir que el usuario interactúe con la localidad.
        menu.mostrarMenu(localidad, in);
    }
}
