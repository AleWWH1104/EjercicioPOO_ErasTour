import java.util.ArrayList;

public class RegistroCompra {
    //Lista que contiene mis compradores de boletos
    public ArrayList<Comprador> Compradores;

    public boolean GuardarComprador(Comprador persona) {
        int cantidadInicial = Compradores.size();
        Compradores.add(persona);
        return cantidadInicial < Compradores.size();
    }

    //Mostrar el registro de compradores
    public ArrayList<Comprador> mostrarRegistro() {
        return Compradores;
    }

    


}
