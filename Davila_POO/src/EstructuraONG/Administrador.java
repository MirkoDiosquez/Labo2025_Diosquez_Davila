package EstructuraONG;

import DireccionClase.Direccion;
import Fecha.Fecha;

public class Administrador extends Asalariados{
    private Computadora computadora;



    public Administrador(String nombre, int edad, Direccion direccion, boolean mensualidad, int sueldo, Banco banco, Fecha fechaCobro, Fecha.Fecha fechaDeAlta, Computadora computadora) {
        super(nombre, edad, direccion, mensualidad, sueldo, banco, fechaCobro, fechaDeAlta);
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
