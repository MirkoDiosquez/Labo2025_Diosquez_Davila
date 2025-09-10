package EstructuraONG;

import DireccionClase.Direccion;
import Fecha.Fecha;

import java.time.LocalDate;

public class Administrador extends Asalariados{
    private Computadora computadora;


    public Administrador(String nombre, int edad, Direccion direccion, boolean mensualidad, LocalDate fechaIngreso, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, Computadora computadora) {
        super(nombre, edad, direccion, mensualidad, fechaIngreso, sueldo, banco, fechaCobro, fechaDeAlta);
        this.computadora = computadora;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    public void mostrar(){
        System.out.println("Usuario: "+ computadora.getNombreUsuario() + " Nombre: " + super.getNombre());
    }

}
