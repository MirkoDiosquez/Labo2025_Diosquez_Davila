package Unidad6.Vacunatorio;

import java.time.LocalDate;

public class Vacuna
{
    private LocalDate fecha_fabricacion ;
    private LocalDate fecha_aplicacion ;
    private int nroLote ;
    private int nroFabricacion ;
    private String nombre ;

    public Vacuna(LocalDate fecha_fabricacion, LocalDate fecha_aplicacion, int nroLote, int nroFabricacion, String nombre) {
        this.fecha_fabricacion = fecha_fabricacion;
        this.fecha_aplicacion = fecha_aplicacion;
        this.nroLote = nroLote;
        this.nroFabricacion = nroFabricacion;
        this.nombre = nombre;
    }

    public LocalDate getFecha_fabricacion() {
        return fecha_fabricacion;
    }

    public void setFecha_fabricacion(LocalDate fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public LocalDate getFecha_aplicacion() {
        return fecha_aplicacion;
    }

    public void setFecha_aplicacion(LocalDate fecha_aplicacion) {
        this.fecha_aplicacion = fecha_aplicacion;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public int getNroFabricacion() {
        return nroFabricacion;
    }

    public void setNroFabricacion(int nroFabricacion) {
        this.nroFabricacion = nroFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
