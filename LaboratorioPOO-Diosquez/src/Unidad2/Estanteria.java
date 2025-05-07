package Unidad2;

import java.util.ArrayList;

public class Estanteria
{
    private int codigo ;
    private ArrayList<Pelicula> Peliculas ;

    public Estanteria ()
    {
        this.codigo = codigo ;
        this.Peliculas = Peliculas ;
    }

    // Getters
    public int getCodigo()
    {
        return this.codigo ;
    }

    public ArrayList<Pelicula> getPeliculas()
    {
        return this.Peliculas ;
    }

    // Setters
    public void setCodigo(int codigo1)
    {
        this.codigo = codigo1 ;
    }

    public void setPeliculas(ArrayList<Pelicula> Peliculas1)
    {
        this.Peliculas = Peliculas1 ;
    }

    // ABM
    public void agregarPelicula(Pelicula nuevaPeli)
    {
        Peliculas.add(nuevaPeli) ;
    }

    public void borrarPelicula(Pelicula sacaPeli)
    {
        for (Pelicula bobo :Peliculas)
        {
            if ( bobo.getNombre() == sacaPeli.getNombre() )
            {
                Peliculas.remove(bobo) ;
            }
        }
    }

    public void modificarPelicula(Pelicula modiPeli, String nombreOg)
    {
        for (Pelicula bobo : Peliculas)
        {
            if ( bobo.getNombre() == nombreOg )
            {
                bobo = modiPeli ;
            }
        }
    }


    public void actoresMayores (Pelicula aux)
    {
        for (Pelicula ee : Peliculas)
        {
            if (ee.getNombre() == aux.getNombre())
            {
                if (aux.)
                {

                }
            }
        }
    }

    public static void main(String[] args)
    {

    }
}
