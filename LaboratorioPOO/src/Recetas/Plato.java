package Recetas;

import java.util.ArrayList;

public abstract class Plato {
    private String nombrePlato;
    private Dificultad dificultad;
    private  ArrayList<String> pasos=new ArrayList<>();

    abstract void mostrar();

    public Plato(String nombrePlato, Dificultad dificultad) {
        this.nombrePlato = nombrePlato;
        this.dificultad = dificultad;
        this.pasos = pasos;
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
