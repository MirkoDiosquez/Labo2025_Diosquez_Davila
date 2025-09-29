package RepasoEvaluacionOctubre;

import java.util.HashSet;

abstract class Plato
{
    private HashSet<String> ingredientes ;
    private int tiempoPreparar ;

    public Plato(HashSet<String> ingredientes, int tiempoPreparar) {
        this.ingredientes = ingredientes;
        this.tiempoPreparar = tiempoPreparar;
    }

    public HashSet<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTiempoPreparar() {
        return tiempoPreparar;
    }

    public void setTiempoPreparar(int tiempoPreparar) {
        this.tiempoPreparar = tiempoPreparar;
    }
}
