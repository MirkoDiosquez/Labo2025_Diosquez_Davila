package Unidad2;

import Unidad1.Persona;

import java.util.ArrayList;

public class Pelicula
{
    private String nombre ;
    private String genero ;
    private int duracion ;
    private Persona director ;
    private ArrayList<Persona> actor ;
    private String idiomas ;

    public Pelicula()
    {
        this.nombre = "";
        this.genero = "";
        this.duracion = 0;
        this.director = new Persona("",0,"");
        this.actor = new ArrayList<>() ;
        this.idiomas = "";
    }

    public Pelicula(String nombre, String genero, int duracion, Persona director, ArrayList<Persona> actor, String idiomas)
    {
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

    public ArrayList<Persona> getActor()
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

    public void setActor(ArrayList<Persona> actor)
    {
        this.actor = actor;
    }

    public void setIdiomas(String idiomas)
    {
        this.idiomas = idiomas;
    }

    public void agregarActor(Persona anashe)
    {
        actor.add(anashe) ;
    }

    public void agregarDirector(Persona anashe)
    {
        director.add(anashe) ;
    }

    public static void main(String[] args)
    {
        Pelicula p1 = new Pelicula() ;

        p1.agregarActor(new Persona("Brad Pitt", 60, "Estados Unidos")) ;
        p1.agregarActor(new Persona("Leonardo DiCaprio", 49, "Estados Unidos"));
        p1.agregarActor(new Persona("Penélope Cruz", 50, "España"));
        p1.agregarActor(new Persona("Jackie Chan", 70, "China"));

        p1.agregarDirector(new Persona("Christopher Nolan", 54, "Reino Unido"));



    }


}
