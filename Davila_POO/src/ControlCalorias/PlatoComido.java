package ControlCalorias;

import Recetas.Dificultad;
import Recetas.Plato;
import Recetas.Postre;

import java.util.HashSet;

public class PlatoComido {
    private String nombre;
    private HashSet<String> ingredientes = new HashSet<>();
    private int cantCalorias;

    public PlatoComido(String nombre, HashSet<String> ingredientes, int cantCalorias) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.cantCalorias = cantCalorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }
}
