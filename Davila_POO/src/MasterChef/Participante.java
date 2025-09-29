package MasterChef;

import DireccionClase.Direccion;
import Persona.Persona;

public abstract class Participante extends Persona {
    private String localidad;
    private Color color;
    abstract String mostrarMensaje();

    public Participante() {
        super();
        this.localidad= "nose";
        this.color= Color.AZUL;

    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
