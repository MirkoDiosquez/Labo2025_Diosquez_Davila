package Unidad3.Flota;

import java.util.ArrayList;

public class Auto extends Automotores
{
    private boolean descapotable ;


    public Auto(String marca, int anio, int ruedas, String color, String modelo, String patente, boolean descapotable)
    {
        super(marca, anio, ruedas, color, modelo, patente);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable()
    {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable)
    {
        this.descapotable = descapotable;
    }
}

