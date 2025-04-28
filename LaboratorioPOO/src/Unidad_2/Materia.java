package Unidad_2;
import java.time.LocalDate;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    ArrayList<String> listadoContenidos = new ArrayList<>();
    ArrayList<AlumnoM> listadoAlumnos = new ArrayList<>();

    public Materia(String nombre, ArrayList<String> listadoContenidos, ArrayList<AlumnoM> listadoAlumnos) {
        this.nombre = nombre;
        this.listadoContenidos = listadoContenidos;
        this.listadoAlumnos = listadoAlumnos;
    }

    public void agregarAlumno(AlumnoM  nuevaAlumno){
        listadoAlumnos.add(nuevaAlumno);
    }

    public ArrayList<String> getListadoContenidos() {
        return listadoContenidos;
    }

    public void setListadoContenidos(ArrayList<String> listadoContenidos) {
        this.listadoContenidos = listadoContenidos;
    }

    public ArrayList<AlumnoM> getListadoAlumnos() {
        return listadoAlumnos;
    }

    public void setListadoAlumnos(ArrayList<AlumnoM> listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double promedioEdadAlumnos()
    {
        int añoActual = LocalDate.now().getYear();
        Double promedio =0.0;
        for (int i = 0; i < listadoAlumnos.size(); i++) {
            promedio+= (double) (listadoAlumnos.get(i).getFechaNacimiento().getAnio()-añoActual);

        }
        promedio= promedio/listadoAlumnos.size();
        return promedio;
    }
}
