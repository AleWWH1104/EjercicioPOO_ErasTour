import java.util.ArrayList;
import java.util.Random;
/**
 * Esta clase representa la gestión de las localidades y la compra de boletos.
 */
public class Localidad {
    public String LocalidadSeleccionada;
    //Declarar los espacios de cada localidad
    public Integer EspacioLocalidad1 = 20;
    public Integer EspacioLocalidad5 = 20;
    public Integer EspacioLocalidad10 = 20;
    //Declarar los precios por localidad
    public Double PrecioLocalidad1 = 100.00;
    public Double PrecioLocalidad5 = 500.00;
    public Double PrecioLocalidad10 = 1000.00;

    //Reporte de caja
    Double ingresosGenerados = 0.00;

    /**
     * Selecciona aleatoriamente una localidad para el comprador y la configura en su objeto.
     *
     * @param comprador El comprador al que se le asignará la localidad.
     */
    public void localidadAleatoria(Comprador comprador){
        ArrayList<String> localidadE = new ArrayList<String>();
        //Agregar las opciones de localidad al Arraylist
        localidadE.add("Localidad 1");
        localidadE.add("Localidad 5");
        localidadE.add("Localidad 10");

        // Crear una instancia de Random
        Random random = new Random();
        // Generar un índice aleatorio del ArrayList
        int indiceAleatorio = random.nextInt(localidadE.size());
        // Acceder al elemento aleatorio e imprimirlo
        LocalidadSeleccionada = localidadE.get(indiceAleatorio);
        System.out.println("Localidad seleccionada aleatoriamente: " + LocalidadSeleccionada);
    
        // Configurar la localidad seleccionada en el objeto comprador
        comprador.setLocalidadSeleccionada(LocalidadSeleccionada);
    }

    //Realizar todas las validaciones
    public void comprarBoleto(int cant_boletos, double presupuesto){
        //Segun la localidad se ejecuta toda la funcion
        Integer espaciosDisponibles = obtenerEspaciosDisponibles(LocalidadSeleccionada);
        Double precioBoleto = obtenerPrecio(LocalidadSeleccionada);

        //Primera validacion
        if (espaciosDisponibles == 0) {
            System.out.println("Lo sentimos, no hay espacios disponibles.");
            return; //Se sale de la funcion al no cumplir con esta condicion
        }

        //Segunda validacion
        int VenderBoleto = Math.min(cant_boletos, espaciosDisponibles);
        Double costoTotal = VenderBoleto * precioBoleto;

        //Tercera validacion 
        if (costoTotal > presupuesto){
            System.out.println("Tu presupuesto no es suficiente para comprar los boletos.");
            return;
        }

        //Acumular los ingresos para el reporte de caja
        ingresosGenerados += costoTotal;
        actualizarEspacios(LocalidadSeleccionada, VenderBoleto);
        System.out.println("¡Compra exitosa! Has comprado " + VenderBoleto + " boletos en " + LocalidadSeleccionada + ". Total: $" + costoTotal);
    } 


    public void comprarBoletoEspecial(CodigoEspecial codigo) {
        if (hayEspacioEspecial()) {
            Double costoEspecial = 20000.00;

            if (codigo.getCodigo() != 0) {
                EspacioLocalidad10--;
                ingresosGenerados += costoEspecial;
                System.out.println("Compra de Boleto Especial - Has comprado 1 boleto en Localidad 10 (Especial). Total: $" + costoEspecial);
            } else {
                System.out.println("El código especial no es válido.");
            }
        } else {
            System.out.println("Lo sentimos, no hay espacios disponibles para la compra especial en Localidad 10.");
        }
    }

    /**
     * Realiza la compra de un boleto especial con un código especial.
     *
     * @param codigo El código especial proporcionado para la compra.
     */
    public int obtenerBoletosVendidosEspeciales() {
        return 20 - EspacioLocalidad10;
    }

    // Getter para obtener los ingresos generados
    public Double obtenerIngresosGenerados() {
        return ingresosGenerados;
    }

    /**
     * Obtiene la cantidad de espacios disponibles en una localidad específica.
     *
     * @param localidad La localidad para la que se obtendrá la cantidad de espacios disponibles.
     * @return La cantidad de espacios disponibles en la localidad especificada.
     */
    public Integer obtenerEspaciosDisponibles(String localidad){
        if ("Localidad 1".equals(localidad)) {
            return EspacioLocalidad1;
        } else if ("Localidad 5".equals(localidad)) {
            return EspacioLocalidad5;
        } else if ("Localidad 10".equals(localidad)) {
            return EspacioLocalidad10;
        } else {
            return 0;
        }
    }
    /**
     * Obtiene el precio de un boleto según la localidad.
     *
     * @param localidad La localidad para la que se obtendrá el precio del boleto.
     * @return El precio del boleto para la localidad especificada.
     */
    private Double obtenerPrecio(String localidad) {
        if ("Localidad 1".equals(localidad)) {
            return PrecioLocalidad1;
        } else if ("Localidad 5".equals(localidad)) {
            return PrecioLocalidad5;
        } else if ("Localidad 10".equals(localidad)) {
            return PrecioLocalidad10;
        } else {
            return 0.00;
        }
    }

    /**
     * Verifica si hay espacios disponibles en la localidad 10 para la compra especial.
     *
     * @return true si hay espacios disponibles, false de lo contrario.
     */
    private boolean hayEspacioEspecial() {
        return EspacioLocalidad10 > 0;
    }

    /**
     * Actualiza la cantidad de espacios disponibles en una localidad después de una venta.
     *
     * @param localidad La localidad en la que se actualizarán los espacios disponibles.
     * @param boletosVendidos El número de boletos vendidos en esta transacción.
     */
    private void actualizarEspacios(String localidad, int boletosVendidos) {
        if ("Localidad 1".equals(localidad)) {
            EspacioLocalidad1 -= boletosVendidos;
        } else if ("Localidad 5".equals(localidad)) {
            EspacioLocalidad5 -= boletosVendidos;
        } else if ("Localidad 10".equals(localidad)) {
            EspacioLocalidad10 -= boletosVendidos;
        }
    }
}
