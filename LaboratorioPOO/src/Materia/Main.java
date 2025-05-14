package Materia;

import Unidad_1.CD;
import Unidad_1.Cancion;
import Unidad_1.Fecha;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       //CD
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

        //alumno
        ArrayList<Double> Martinez = new ArrayList<Double>();
        ArrayList<Double> Julian = new ArrayList<Double>();
        Martinez.add(5.0);
        Martinez.add(1.0);
        Martinez.add(10.0);
        Julian.add(6.0);
        Julian.add(8.0);
        Julian.add(0.0);
        Alumno alum1 = new Alumno("Lautaro",14,"Campana 23","Martinez", new Fecha(2023, 4,23), Martinez);
        Alumno alum2 = new Alumno("Julian",14,"Terrada 31", "Alvarez", new Fecha(1986, 5, 19), Julian);
        alum2.agregarNota(5.0);
        alum1.agregarNota(3.0);
        alum1.menorNota();
        alum1.mayorNota();
        //alumnoMaterias

        ArrayList<AlumnoM> alumno= new ArrayList<>();
        ArrayList<Materia> materia = new ArrayList<>();
        ArrayList<String> contenido = new ArrayList<>();

        AlumnoM alum11 = new AlumnoM("Matisa", 41,"amdasda","Ruiz", new Fecha(2023, 4,23),Martinez,  materia);
        Materia mate1 = new Materia("Matematica", contenido, alumno);
        AlumnoM nuevaAlumno = new AlumnoM("Matise", 31,"dada","Rusiz", new Fecha(2023, 4,23), Julian,materia);
        Materia nuevaMateria = new Materia("Matematicas", contenido, alumno);
        mate1.agregarAlumno(nuevaAlumno);
        alum11.agregarMateria(nuevaMateria);
        mate1.promedioEdadAlumnos();
        alum11.promedioNotasAlumnos();
    }
}