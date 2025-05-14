package Vehiculos;

import java.time.LocalDate;

public class Auto extends VehiculoMotorizado{
private boolean descapotable;

    public Auto(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabricacion, String patente, boolean descapotable) {
        super(marca, modelo, color, cantRuedas, fechaFabricacion, patente);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
