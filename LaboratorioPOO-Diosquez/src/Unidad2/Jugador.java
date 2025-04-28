package Unidad2;

import Unidad1.Fecha;

public class Jugador
{
    private String nombre_jugador ;
    private Fecha fecha ;
    private int numero ;
    private boolean capitan ;

    public Jugador (String nombre_jugador , Fecha fecha, int numero )
    {
        this.nombre_jugador = nombre_jugador ;
        this.fecha = fecha ;
        this.numero = numero ;
    }

    // Getters
    public String getNombre_jugador()
    {
        return nombre_jugador;
    }

    public Fecha getFecha()
    {
        return fecha;
    }

    public int getNumero()
    {
        return numero;
    }

    public boolean isCapitan()
    {
        return capitan;
    }

    // Setters
    public void setNombre_jugador(String nombre_jugador)
    {
        this.nombre_jugador = nombre_jugador;
    }

    public void setFecha(Fecha fecha)
    {
        this.fecha = fecha;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public void setCapitan(boolean capitan)
    {
        this.capitan = capitan;
    }
}
