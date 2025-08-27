package Unidad7.BibliotecaVirtual;

import Unidad1.Persona;

public class Autor extends Persona
{
    private String bibiografia ;

    public Autor(String direccion, String nombre, String apellido, int edad, String bibiografia) {
        super(direccion, nombre, apellido, edad);
        this.bibiografia = bibiografia;
    }
}
