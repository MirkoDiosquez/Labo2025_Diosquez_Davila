package EstructuraONG;

import DireccionClase.Direccion;

import java.time.LocalDate;

public class Titular extends Profesor{
    private Materia materia;

    public Titular(String nombre, int edad, Direccion direccion, boolean mensualidad, LocalDate fechaIngreso, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, ProfesorBarrio barrio, Materia materia) {
        super(nombre, edad, direccion, mensualidad, fechaIngreso, sueldo, banco, fechaCobro, fechaDeAlta, barrio);
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public void mostrarMateria(){
        System.out.println("La Materia es: " + materia);
    }
}
