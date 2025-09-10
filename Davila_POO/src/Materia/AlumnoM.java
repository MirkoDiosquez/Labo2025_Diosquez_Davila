package Materia;
import DireccionClase.Direccion;
import Fecha.Fecha;
import Persona.Persona;

import java.util.ArrayList;

public class AlumnoM extends Persona {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Double> notas = new ArrayList<Double>();
    private ArrayList<Materia> materias = new ArrayList<>();

    public AlumnoM(String nombre, String apellido, Fecha fechaNacimiento, ArrayList<Double> notas, ArrayList<Materia> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.notas = notas;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public void agregarMateria(Materia nuevaMateria){
        materias.add(nuevaMateria);
    }


    public Double  promedioNotasAlumnos()
    {
        Double promedio =0.0;
        for (Double nota : notas){
            promedio+=nota;
        }
        promedio= promedio/notas.size();
        return promedio;
    }
}

