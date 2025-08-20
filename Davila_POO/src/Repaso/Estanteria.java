package Repaso;

import java.util.ArrayList;

public class Estanteria {
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public Estanteria(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    public Pelicula mayDuracion(){
        Pelicula pelimayorDuracion = peliculas.getFirst();
        for (Pelicula peliculass: peliculas){
            if (peliculass.getDuracion()> pelimayorDuracion.getDuracion())pelimayorDuracion=peliculass;
        }
    return  pelimayorDuracion;
    }
    public void directoresCant(){
        int contador=0;
        for (int i = 0; i < peliculas.size(); i++) {
            for (int j = i + 1; j < peliculas.size(); j++) {
                if (peliculas.get(i).getDirectores() == peliculas.get(j).getDirectores()) contador++;
                }
            if (contador > 2) System.out.println(peliculas.get(i).getDirectores());
            contador = 0;
        }
    }

}
