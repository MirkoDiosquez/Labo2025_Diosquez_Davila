package Unidad2;


import Unidad1.Cancion;

import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> canciones ;

    // Constructor por defecto
    public CD ()
    {
        this.canciones = new ArrayList<Cancion>() ;
    }

    // Metodo para agregar una cancion al array
    public void agregarCancion(Cancion cancion)
    {
        canciones.add(cancion);
    }

    // Getters
    public ArrayList<Cancion> listaDeCanciones ()
    {
        return canciones ;
    }
    
    public static void main(String[] args)
    {
        System.out.println();
    }



}
