package Vehiculos;

import java.time.LocalDate;

public class Camioneta extends  VehiculoMotorizado {
    private double capacidadCarga;

    public Camioneta(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabricacion, String patente, double capacidadCarga) {
        super(marca, modelo, color, cantRuedas, fechaFabricacion, patente);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

}
