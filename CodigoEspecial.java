/**
 * Esta clase representa un código especial que debe ser un número de la secuencia de Fibonacci.
 */
public class CodigoEspecial {
    private int codigo;

    /**
     * Constructor que verifica si el código es válido (número de Fibonacci) y lo asigna si es válido.
     *
     * @param codigo El código a validar y asignar.
     */
    public CodigoEspecial(int codigo) {
        if (isFibonacci(codigo)) {
            this.codigo = codigo;
        } else {
            System.out.println("El Código Especial NO es válido.");
        }
    }

    /**
     * Obtiene el código especial.
     *
     * @return El código especial.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Verifica si un número es parte de la secuencia de Fibonacci.
     *
     * @param num El número a verificar.
     * @return true si el número es parte de la secuencia de Fibonacci, false de lo contrario.
     */
    private boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int sum = a + b;

        while (sum <= num) {
            if (sum == num) {
                return true;
            }
            a = b;
            b = sum;
            sum = a + b;
        }

        return false;
    }
}
