package Recetas;

import java.util.ArrayList;

public class Entrada extends Plato{
    private Estado estado;

    public Entrada(String nombrePlato, Dificultad dificultad, Estado estado) {
        super(nombrePlato, dificultad);
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void mostrar() {
        if (estado.name().equals("FRIA")) {
            for (String p : super.getPasos()) {
                System.out.println(p);

            }
            System.out.println("Guardar la preparacion en la heladera");
        } else if (estado.name().equals("CALIENTE")) {
            System.out.println("Recordar prender el horno");
            for (String p : super.getPasos()) {
                System.out.println(p);
            }
        }
    }
    public boolean esDeltipo(Plato p){
        if (p instanceof Entrada)return true;
        else return false;
    }
}
