package Unidad2;

import Unidad1.Persona;

import java.util.ArrayList;

public class Pelicula
{
    private int numeroEstanteria ;
    private String nombre ;
    private String genero ;
    private int duracion ;
    private Persona director ;
    private Persona actor ;
    private String idiomas ;

    public Pelicula()
    {
        this.numeroEstanteria = 0;
        this.nombre = "";
        this.genero = "";
        this.duracion = 0;
        this.director = new Persona("",0,"");
        this.actor = new Persona("",0,"");
        this.idiomas = "";
    }

    public Pelicula(int numeroEstanteria, String nombre, String genero, int duracion, Persona director, ArrayList<Persona> actor, String idiomas)
    {
        this.numeroEstanteria = numeroEstanteria;
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
        this.actor = actor;
        this.idiomas = idiomas;
    }

    // Getters
    public String getNombre()
    {
        return nombre;
    }

    public Persona getDirector()
    {
        return director;
    }

    public int getDuracion()
    {
        return duracion;
    }

    public String getIdiomas()
    {
        return idiomas;
    }

    public Persona getActor()
    {
        return actor;
    }

    // Setters

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public void setDuracion(int duracion)
    {
        this.duracion = duracion;
    }

    public void setDirector(Persona director)
    {
        this.director = director;
    }

    public void setActor(Persona actor)
    {
        this.actor = actor;
    }

    public void setIdiomas(String idiomas)
    {
        this.idiomas = idiomas;
    }

    public void agregarActor()
    {

    }
    public static void main(String[] args)
    {
        Pelicula p1 = new Pelicula() ;
        Persona actor1 = new Persona("Brad Pitt", 60, "Estados Unidos");
        Persona actor2 = new Persona("Leonardo DiCaprio", 49, "Estados Unidos");
        Persona actor3 = new Persona("Penélope Cruz", 50, "España");
        Persona actor4 = new Persona("Jackie Chan", 70, "China");


    }
}
