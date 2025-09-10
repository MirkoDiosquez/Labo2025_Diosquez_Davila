package Pedidos;

import DireccionClase.Direccion;
import Persona.Persona;

public class Alumno extends Persona {
    private String divison;

    public Alumno(String nombre, int edad, Direccion direccion, String divison) {
        super(nombre, edad, direccion);
        this.divison = divison;
    }

    public String getDivison() {
        return divison;
    }

    public void setDivison(String divison) {
        this.divison = divison;
    }
}
