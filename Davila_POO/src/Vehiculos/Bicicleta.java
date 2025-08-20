package Vehiculos;

import java.time.LocalDate;

public class Bicicleta extends Vehiculo{
    private int cambios;
    private int ruedasCarbono;

    public Bicicleta(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabricacion, int cambios, int ruedasCarbono) {
        super(marca, modelo, color, cantRuedas, fechaFabricacion);
        this.cambios = cambios;
        this.ruedasCarbono = ruedasCarbono;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getRuedasCarbono() {
        return ruedasCarbono;
    }

    public void setRuedasCarbono(int ruedasCarbono) {
        this.ruedasCarbono = ruedasCarbono;
    }
}
