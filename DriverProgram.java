import java.util.Scanner;

public class DriverProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Localidad localidad = new Localidad();
        Menu menu = new Menu();
        menu.mostrarMenu(localidad, in);
    }
}
