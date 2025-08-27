package Sistema_de_Viviendas;

import java.time.YearMonth;
import java.util.HashMap;

public class Departamento extends Vivienda
{
    private int cantidadAmbientes;

    public Departamento(String direccion, int codigoPostal, Persona dueño, HashMap<YearMonth, Integer> consumo, int costo, int cantidadAmbientes) {
        super(direccion, codigoPostal, dueño, consumo, costo);
        this.cantidadAmbientes = cantidadAmbientes;
    }

    public int getCantidadAmbientes() {
        return cantidadAmbientes;
    }

    public void setCantidadAmbientes(int cantidadAmbientes) {
        this.cantidadAmbientes = cantidadAmbientes;
    }

}
