import java.util.ArrayList;
import java.util.Random;

public class Localidad {
    //Declarar los espacios de cada localidad
    public Integer Localidad1 = 20;
    public Integer Localidad5 = 20;
    public Integer Localidad10 = 20;

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
        String LocalidadSeleccionada = localidadE.get(indiceAleatorio);
        System.out.println("Localidad seleccionada aleatoriamente: " + LocalidadSeleccionada);
    
    }

    

}
