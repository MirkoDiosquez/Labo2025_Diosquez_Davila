package EstructuraONG;

import DireccionClase.Direccion;
import Persona.Persona;

import java.time.LocalDate;

public abstract class Participante extends Persona {
    private boolean mensualidad;
    private LocalDate fechaIngreso;

    public Participante(String nombre, int edad, Direccion direccion, boolean mensualidad, LocalDate fechaIngreso) {
        super(nombre, edad, direccion);
        this.mensualidad = mensualidad;
        this.fechaIngreso = fechaIngreso;
    }

    public boolean isMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(boolean mensualidad) {
        this.mensualidad = mensualidad;
    }
    abstract void accionSolidaria();
    public boolean esMayorEdad(){
        return super.esMayorDeEdad();
    }
    public String mostrarHace2M(){
     LocalDate fechaHoyDosMeses = LocalDate.now().minusMonths(2);
     if (fechaIngreso.isAfter(fechaHoyDosMeses))
         return super.getNombre();
     else return "";
    }
}
