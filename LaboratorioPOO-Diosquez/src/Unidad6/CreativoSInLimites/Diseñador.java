package Unidad6.CreativoSInLimites;

import java.util.HashMap;
import java.util.HashSet;

public class Diseñador extends Empleado
{
    private int sueldo ;
    private HashMap<HashSet<Proyecto>, Integer> proyectos;
    private TipoDiseñador tipo ;


    public Diseñador(String apellido, String nombre, int dni, int sueldo, HashMap<HashSet<Proyecto>, Integer> proyectos, TipoDiseñador tipo)
    {
        super(apellido, nombre, dni);
        this.sueldo = sueldo;
        this.proyectos = proyectos;
        this.tipo = tipo ;
    }

    public HashMap<HashSet<Proyecto>, Integer> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<HashSet<Proyecto>, Integer> proyectos) {
        this.proyectos = proyectos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public TipoDiseñador getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiseñador tipo) {
        this.tipo = tipo;
    }
}
