package Unidad2;

import Unidad1.Fecha;
import Unidad1.Persona;

public class Jugador extends Persona
{
    private int dorsal ;
    private boolean capitan ;

    public Jugador (String nombre, String apellido,String direccion , int edad , Fecha fecha, int dorsal , boolean capitan)
    {
       super(nombre, apellido, direccion, edad);
       this.dorsal = dorsal ;
       this.capitan = capitan ;
    }

    // Getters

    public int getDorsal()
      {
        return dorsal;
    }

    public boolean isCapitan()
    {
        return capitan;
    }

    // Setters

    public void setDorsal(int dorsal)
    {
        this.dorsal = dorsal;
    }

    public void setCapitan(boolean capitan)
    {
        this.capitan = capitan;
    }
}
