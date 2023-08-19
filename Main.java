import java.util.Scanner; // Importa la clase Scanner si aún no lo has hecho

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para el código especial: ");
        int inputCode = scanner.nextInt();

        CodigoEspecial codigoEspecial = new CodigoEspecial(inputCode);

        if (codigoEspecial.getCodigo() != 0) {
            System.out.println("Código especial válido: " + codigoEspecial.getCodigo());
        }

        scanner.close();
    }
}
