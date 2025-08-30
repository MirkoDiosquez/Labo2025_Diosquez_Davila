package EstructuraONG;

import DireccionClase.Direccion;
import Fecha.Fecha;

import java.time.LocalDate;

public abstract class Asalariados extends Participante{
    private int sueldo;
    private Banco banco;
    private LocalDate fechaCobro;
    private LocalDate fechaDeAlta;

    public Asalariados(String nombre, int edad, Direccion direccion, boolean mensualidad, LocalDate fechaIngreso, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta) {
        super(nombre, edad, direccion, mensualidad, fechaIngreso);
        this.sueldo = sueldo;
        this.banco = banco;
        this.fechaCobro = fechaCobro;
        this.fechaDeAlta = fechaDeAlta;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    abstract void mostrar();

    public LocalDate getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(LocalDate fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }
    public void accionSolidaria(){
        mostrar();
    }



}
