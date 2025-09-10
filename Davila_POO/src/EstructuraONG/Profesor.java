package EstructuraONG;

import DireccionClase.Direccion;

import java.time.LocalDate;

public  abstract class Profesor extends Asalariados{
    private ProfesorBarrio barrio;

    public Profesor(String nombre, int edad, Direccion direccion, boolean mensualidad, LocalDate fechaIngreso, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, ProfesorBarrio barrio) {
        super(nombre, edad, direccion, mensualidad, fechaIngreso, sueldo, banco, fechaCobro, fechaDeAlta);
        this.barrio = barrio;
    }

    public ProfesorBarrio getBarrio() {
        return barrio;
    }

    public void setBarrio(ProfesorBarrio barrio) {
        this.barrio = barrio;
    }
    abstract void mostrarMateria();
    public void mostrar(){
        mostrarMateria();
    }

}
