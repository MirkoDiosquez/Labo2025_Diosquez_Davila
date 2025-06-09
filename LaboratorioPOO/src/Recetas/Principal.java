package Recetas;

import java.time.Duration;
import java.util.ArrayList;

public class Principal extends Plato{
    private Duration tiempoCoccion;
    private int numeroComensales;

    public Principal(String nombrePlato, Dificultad dificultad, ArrayList<String> pasos, Duration tiempoCoccion, int numeroComensales) {
        super(nombrePlato, dificultad, pasos);
        this.tiempoCoccion = tiempoCoccion;
        this.numeroComensales = numeroComensales;
    }

    public void mostrar(){
        System.out.println("Esta receta tarda en cocinarse "+tiempoCoccion+ " y los pasos son " + super.getPasos());
    }
}
