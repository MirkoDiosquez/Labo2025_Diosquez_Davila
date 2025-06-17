package Recetas;

import java.time.Duration;
import java.util.ArrayList;

public class Principal extends Plato{
    private Duration tiempoCoccion;
    private int numeroComensales;

    public Principal(String nombrePlato, Dificultad dificultad, Duration tiempoCoccion, int numeroComensales) {
        super(nombrePlato, dificultad);
        this.tiempoCoccion = tiempoCoccion;
        this.numeroComensales = numeroComensales;
    }

    public Duration getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(Duration tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    public void mostrar(){
        System.out.println("Esta receta tarda en cocinarse "+tiempoCoccion+ " y los pasos son " + super.getPasos());
    }
    public boolean esDeltipo(Plato p){
        if (p instanceof Principal)return true;
        else return false;
    }
}
