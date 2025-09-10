package EstructuraONG;

import DireccionClase.Direccion;

import java.time.LocalDate;

public class VoluntarioMiebro extends Participante{
    private int puntaje;
    private MiembroBarrios barrio;

    public VoluntarioMiebro(String nombre, int edad, Direccion direccion, boolean mensualidad, LocalDate fechaIngreso, int puntaje, MiembroBarrios barrio) {
        super(nombre, edad, direccion, mensualidad, fechaIngreso);
        this.puntaje = puntaje;
        this.barrio = barrio;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public MiembroBarrios getBarrio() {
        return barrio;
    }

    public void setBarrio(MiembroBarrios barrio) {
        this.barrio = barrio;
    }

    public void accionSolidaria(){
        System.out.println("Ofrezco mi ayuda al que lo necesite!");
        puntaje++;
    }
}
