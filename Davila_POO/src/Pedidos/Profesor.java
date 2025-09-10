package Pedidos;

import DireccionClase.Direccion;
import Persona.Persona;

public class Profesor extends Persona {
    private double porcentajeDescuento;

    public Profesor(String nombre, int edad, Direccion direccion, double porcentajeDescuento) {
        super(nombre, edad, direccion);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
