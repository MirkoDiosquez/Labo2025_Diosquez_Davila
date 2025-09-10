package EstructuraONG;

import DireccionClase.Direccion;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Interino extends Profesor{
    private HashMap<Materia, Integer> infoMaterias;

    public Interino(String nombre, int edad, Direccion direccion, boolean mensualidad, LocalDate fechaIngreso, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, ProfesorBarrio barrio, HashMap<Materia, Integer> infoMaterias) {
        super(nombre, edad, direccion, mensualidad, fechaIngreso, sueldo, banco, fechaCobro, fechaDeAlta, barrio);
        this.infoMaterias = infoMaterias;
    }

    public HashMap<Materia, Integer> getInfoMaterias() {
        return infoMaterias;
    }

    public void setInfoMaterias(HashMap<Materia, Integer> infoMaterias) {
        this.infoMaterias = infoMaterias;
    }
    public void mostrarMateria(){
        for (Materia m: infoMaterias.keySet()){
        System.out.println("Las materias son: " + m);
    }
    }


}
