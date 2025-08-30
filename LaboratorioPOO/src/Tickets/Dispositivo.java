package Tickets;

public class Dispositivo {
    private String nombre;
    private int repuestosDisponibles;

    public Dispositivo(String nombre, int repuestosDisponibles) {
        this.nombre = nombre;
        this.repuestosDisponibles = repuestosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRepuestosDisponibles() {
        return repuestosDisponibles;
    }

    public void setRepuestosDisponibles(int repuestosDisponibles) {
        this.repuestosDisponibles = repuestosDisponibles;
    }
}
