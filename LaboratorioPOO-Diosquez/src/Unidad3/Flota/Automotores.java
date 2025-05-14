package Unidad3.Flota;

import java.util.ArrayList;

public class Automotores extends Vehiculo
{
    private String patente ;

    public Automotores(String marca, int anio, int ruedas, String color, String modelo, String patente)
    {
        super(marca, anio, ruedas, color, modelo);
        this.patente = patente;
    }

    public String getPatente()
    {
        return patente;
    }

    public void setPatente(String patente)
    {
        this.patente = patente;
    }
}
