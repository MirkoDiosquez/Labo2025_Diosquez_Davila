package EstructuraONG;

import DireccionClase.Direccion;

import java.time.LocalDate;

public class VoluntarioExterno extends Participante{
    private Institucion institucion;
    private ExternosBarrio barrio;

    public VoluntarioExterno(String nombre, int edad, Direccion direccion, boolean mensualidad, LocalDate fechaIngreso, Institucion institucion, ExternosBarrio barrio) {
        super(nombre, edad, direccion, mensualidad, fechaIngreso);
        this.institucion = institucion;
        this.barrio = barrio;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
    public void accionSolidaria(){
        System.out.println("Ofrezco mi ayuda al que lo necesite!");
    }
}
