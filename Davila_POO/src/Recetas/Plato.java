package Recetas;

import MasterChef.Ingrediente;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Plato {
    private String nombrePlato;
    private Dificultad dificultad;
    private  ArrayList<String> pasos;
    private HashSet<Ingrediente> ingredientes;
    private int tiempo;

    abstract void mostrar();
    abstract boolean esDeltipo(Plato p);
    public Plato(String nombrePlato, Dificultad dificultad) {
        this.nombrePlato = nombrePlato;
        this.dificultad = dificultad;
        this.pasos = pasos;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public HashSet<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }
}
