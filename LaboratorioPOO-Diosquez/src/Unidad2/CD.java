package Unidad2;


import Unidad1.Cancion;

import java.util.ArrayList;
import java.util.Scanner;

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
    public ArrayList<Cancion> getCanciones ()
    {
        return canciones ;
    }

    //Setter
    public void setCanciones(ArrayList<Cancion> canciones)
    {
        this.canciones = canciones;
    }

    public int numeroCanciones()
    {
       int auxi = 0 ;
        for (Cancion lababa : canciones)
        {
            auxi += 1 ;
        }
       return auxi;
    }

    public String verCancion(int posicion)
    {
        if (posicion >= 0 && posicion < canciones.size() )
        {
            Cancion auxx = canciones.get(posicion) ;
            return "La canción en la posicion " +posicion +" es: " +auxx.getTitulo() ;
        }
        else
        {
        return "Posicion invalida" ;
        }
    }

    public void grabaCancion(int posicion, Cancion nuevaCancion)
    {
        Cancion auxi = canciones.get(posicion) ;
        canciones.set(posicion, nuevaCancion) ;
    }

    public static void main(String[] args)
    {
        CD c1 = new CD () ;
        Scanner entrada = new  Scanner(System.in) ;
        int posicion = 0 ;
        System.out.println("La cantidad de canciones dentro del CD: " +c1.numeroCanciones()) ;
        System.out.println("Introduzca una posicion de cancion de CD para saber cual es");
        posicion = entrada.nextInt() ;



    }



}
