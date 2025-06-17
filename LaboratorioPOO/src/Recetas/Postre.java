package Recetas;

import java.util.ArrayList;

public class Postre extends Plato {
    private int temperaturaPreparacion;
    private boolean diabeticos;

    public Postre(String nombrePlato, Dificultad dificultad, int temperaturaPreparacion, boolean diabeticos) {
        super(nombrePlato, dificultad);
        this.temperaturaPreparacion = temperaturaPreparacion;
        this.diabeticos = diabeticos;
    }

    public int getTemperaturaPreparacion() {
        return temperaturaPreparacion;
    }

    public void setTemperaturaPreparacion(int temperaturaPreparacion) {
        this.temperaturaPreparacion = temperaturaPreparacion;
    }

    public boolean isDiabeticos() {
        return diabeticos;
    }

    public void setDiabeticos(boolean diabeticos) {
        this.diabeticos = diabeticos;
    }
    public void mostrar(){
        for (String p: super.getPasos()){
            System.out.println(p + " Recordar mantener la cocina limpia y el horno al minimo");
        }
    }
    public boolean esDeltipo(Plato p){
        if (p instanceof Postre)return true;
        else return false;
    }
}
