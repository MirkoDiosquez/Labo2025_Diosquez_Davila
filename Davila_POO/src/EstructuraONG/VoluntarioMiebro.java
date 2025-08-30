package EstructuraONG;

import DireccionClase.Direccion;

public class VoluntarioMiebro extends Participante{
    private int puntaje;
    private MiembroBarrios barrio;

    public VoluntarioMiebro(String nombre, int edad, Direccion direccion, boolean mensualidad, int puntaje) {
        super(nombre, edad, direccion, mensualidad);
        this.puntaje = puntaje;
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
