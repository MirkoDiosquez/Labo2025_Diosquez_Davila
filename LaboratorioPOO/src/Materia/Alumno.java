package Materia;
import Unidad_1.Fecha;
import Unidad_1.Persona;

import java.util.ArrayList;

public class Alumno extends Persona {
    private  String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Double> notas = new ArrayList<Double>();

    public Alumno(String nombre, int edad, String direccion, String apellido, Fecha fechaNacimiento, ArrayList<Double> notas) {
       super(nombre, edad, direccion);
       this.apellido= apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.notas = notas;
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
    public void agregarNota(double nota){
        notas.add(nota);
        System.out.println("La ultima nota es " + notas.getLast());
    }
    public void menorNota() {
        double menor = notas.getFirst();
        for (Double aux : notas) {
            if (aux < menor) menor = aux;

        }
        System.out.println(menor);
    }
    public void mayorNota() {
        double mayor = notas.getFirst();
        for (Double aux : notas) {
            if (aux > mayor) mayor = aux;

        }
        System.out.println(mayor);
    }
}
