package RepasoEvaluacionOctubre;

import Unidad1.Persona;

abstract class Participante extends Persona
{
    private Color colorEquipo ;

    public Participante(String direccion, String nombre, String apellido, int edad, Color colorEquipo) {
        super(direccion, nombre, apellido, edad);
        this.colorEquipo = colorEquipo;
    }

    public Color getColorEquipo() {
        return colorEquipo;
    }

    public void setColorEquipo(Color colorEquipo) {
        this.colorEquipo = colorEquipo;
    }

    abstract void comprobacion() ;
}
