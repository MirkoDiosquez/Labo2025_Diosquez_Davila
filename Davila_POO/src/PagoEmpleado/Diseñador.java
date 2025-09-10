package PagoEmpleado;

import DireccionClase.Direccion;
import Persona.Persona;

import java.util.HashSet;

public class Diseñador extends Persona {
    private Tipo tipo;
    private HashSet<Proyecto> proyectos = new HashSet<>();
    private double sueldo;

    public Diseñador(String nombre, int edad, Direccion direccion, Tipo tipo, HashSet<Proyecto> proyectos, double sueldo) {
        super(nombre, edad, direccion);
        this.tipo = tipo;
        this.proyectos = proyectos;
        this.sueldo = sueldo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public HashSet<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashSet<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    public double sueldo(){
        double totComision=0;
        for (Proyecto p: proyectos){
            totComision+= p.getPrecio()*(this.tipo.getComision()/100);
        }
        return totComision;
    }
    public int cantidadProyectosRealizados(){
        return proyectos.size();
    }
    public double gananciaSinComision(Proyecto Proyecto){
        if (proyectos.contains(Proyecto))return  Proyecto.getPrecio();
        else return 0;

    }
    public void sueldoDiscrimando(){
        for (Proyecto p: proyectos){
            System.out.println("El nombre del proyecto es " + p.getNombre());
            System.out.println("La ganancia fue de "+ p.getPrecio());
            System.out.println("La comision es del " + this.tipo.getComision()*100 + " %");
        }
    }

}
