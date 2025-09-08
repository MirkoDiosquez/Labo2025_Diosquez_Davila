package EleccionesOctubre;

import Persona.Persona;

import java.time.LocalTime;
import java.util.ArrayList;

public class Trabajador extends Persona  implements Campania{
 private int cuil;
 private double sueldo;
private boolean estaEnHorarioLaboral;

 @Override
 public String  hacerCampania() {
    if (estaEnHorarioLaboral) return "Lanzando un papelito que dice: Vote por el partido para un mejor futuro";
    else return  "No esta en horario laboral";
 }
}
