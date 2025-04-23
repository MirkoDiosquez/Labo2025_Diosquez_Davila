package Unidad_2;

import Unidad_1.Cancion;

public class Main {
    public static void main(String[] args) {
        CD miCD = new CD();

        Cancion c1 = new Cancion("Bohemian Rhapsody", "Queen");
        Cancion c2 = new Cancion("Imagine", "John Lennon");
        Cancion c3 = new Cancion("Billie Jean", "Michael Jackson");

        miCD.agregarCancion(c1);
        miCD.agregarCancion(c2);
        miCD.agregarCancion(c3);

        miCD.numeroCanciones();

        System.out.println("Canción en la posición 1: " + miCD.posicionCancion(0).getTitulo());

        Cancion nueva = new Cancion("Hey Jude", "The Beatles");
        miCD.grabarCancion(1, nueva);


        miCD.eliminarCanciones(0);

    }
}