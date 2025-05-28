package Computadoras;

import Unidad_1.Persona;

import java.util.ArrayList;

public class Impresora extends  DispositivoSalida{
    private boolean laser;
    private boolean inyeccion;

    public Impresora(Persona fabricante, String modelo, int precio, int stock, ArrayList<String> puertos, boolean laser, boolean inyeccion) {
        super(fabricante, modelo, precio, stock, puertos);
        this.laser = laser;
        this.inyeccion = inyeccion;
    }

    public boolean isLaser() {
        return laser;
    }

    public void setLaser(boolean laser) {
        this.laser = laser;
    }

    public boolean isInyeccion() {
        return inyeccion;
    }

    public void setInyeccion(boolean inyeccion) {
        this.inyeccion = inyeccion;
    }
}
