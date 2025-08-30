package EstructuraONG;

import DireccionClase.Direccion;

public class VoluntarioExterno extends Participante{
    private Institucion institucion;
    private ExternosBarrio barrio;

    public VoluntarioExterno(String nombre, int edad, Direccion direccion, boolean mensualidad, Institucion institucion) {
        super(nombre, edad, direccion, mensualidad);
        this.institucion = institucion;
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
