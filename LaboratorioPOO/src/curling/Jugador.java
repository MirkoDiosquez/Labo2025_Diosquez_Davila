package curling;
import Unidad_1.Fecha;
public class Jugador {
    private String Nombre;
    private Fecha fecha;
    private int numero;
    private boolean capitan;

    public Jugador(String nombre, Fecha fecha, int numero, boolean capitan) {
        Nombre = nombre;
        this.fecha = fecha;
        this.numero = numero;
        this.capitan = capitan;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }
}
