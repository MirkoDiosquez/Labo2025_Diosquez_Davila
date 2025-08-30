package Persona;

import DireccionClase.Direccion;
import Fecha.Fecha;

public abstract class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;
    private Fecha fNacimiento;
    private int codigoPostal;

    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Persona(){

    }
    public boolean esMayorDeEdad(){
        if (edad>18)return true;
        return false;
    }
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarInfo(){
        System.out.println("El nombre es "+ getNombre());
        System.out.println("La edad es "+ getEdad());
        System.out.println("La direccion es "+ getDireccion());
    }
}

