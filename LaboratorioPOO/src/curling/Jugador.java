package curling;

import Unidad_1.Persona;

import java.time.LocalDate;

public class Jugador extends Persona {
    LocalDate fechaNacimiento;
    int numeroCamiseta;
    Boolean capitan;


    public Jugador() {
        super(nombre, edad, Direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCamiseta = numeroCamiseta;
        this.capitan = capitan;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroCamiseta() {
        return this.numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public Boolean getCapitan() {
        return this.capitan;
    }

    public void setCapitan(Boolean capitan) {
        this.capitan = capitan;
    }
}
