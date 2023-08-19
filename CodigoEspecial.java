public class CodigoEspecial {
    private int codigo;

    public CodigoEspecial(int codigo) {
        if (isFibonacci(codigo)) {
            this.codigo = codigo;
        } else {
            System.out.println("El Codigo Especial no es válido.");
        }
    }

    public int getCodigo() {
        return codigo;
    }

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
