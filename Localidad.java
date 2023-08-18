import java.util.ArrayList;
import java.util.Random;

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

    public void localidadAleatoria(){
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
        actualizarEspacios(LocalidadSeleccionada, VenderBoleto);
        System.out.println("¡Compra exitosa! Has comprado " + VenderBoleto + " boletos en " + LocalidadSeleccionada + ". Total: $" + costoTotal);
   
   } 

    private Integer obtenerEspaciosDisponibles(String localidad){
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
