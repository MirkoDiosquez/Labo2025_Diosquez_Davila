package Vehiculos;

import java.time.LocalDate;

public class VehiculoMotorizado extends  Vehiculo{
    private String patente;

    public VehiculoMotorizado(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabricacion, String patente) {
        super(marca, modelo, color, cantRuedas, fechaFabricacion);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
