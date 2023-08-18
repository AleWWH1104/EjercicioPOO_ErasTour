import java.util.ArrayList;
import java.util.Random;

public class Localidad {
    //Declarar los espacios de cada localidad
    public Integer EspacioLocalidad1 = 20;
    public Integer EspacioLocalidad5 = 20;
    public Integer EspacioLocalidad10 = 20;
    public String LocalidadSeleccionada;

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
        int espaciosDisponibles = 0;
        if (LocalidadSeleccionada == "Localidad 1"){
            espaciosDisponibles = EspacioLocalidad1;
        } else if (LocalidadSeleccionada == "Localidad 5"){
            espaciosDisponibles = EspacioLocalidad5;
        } else if (LocalidadSeleccionada == "Localidad 10"){
            espaciosDisponibles = EspacioLocalidad10;
        }
        if (espaciosDisponibles == 0){
            System.out.println("Lo sentimos, no hay espacios disponibles");
        }
        


    

}
