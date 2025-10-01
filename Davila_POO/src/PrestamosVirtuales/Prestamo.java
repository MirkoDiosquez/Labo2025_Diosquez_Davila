package PrestamosVirtuales;

import Fecha.Fecha;

import java.time.LocalDate;

public class Prestamo implements PrestamoInteface{
    private String info;
    private int numSocio;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Publicacion p;

    public Prestamo(String info, int numSocio, LocalDate fechaPrestamo, LocalDate fechaDevolucion, Publicacion p) {
        this.info = info;
        this.numSocio = numSocio;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.p = p;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Publicacion getP() {
        return p;
    }

    public void setP(Publicacion p) {
        this.p = p;
    }

    public void darPrestamo(){
        if (p.toString().equals("Libro")) System.out.println("La fecha de devolucion es " + LocalDate.now().plusDays(15) + " El titulo es "+ p.getTitulo());
        else if (p.toString().equals("Revista") && p.getFechaPublicacion().getAnio()<2020)System.out.println("La fecha de devolucion es " + LocalDate.now().plusDays(10) + " El titulo es "+ p.getTitulo());
        else if (p.toString().equals("Revista")&& p.getFechaPublicacion().getAnio()>2020) System.out.println("La fecha de devolucion es " + LocalDate.now().plusDays(3) + " El titulo es "+ p.getTitulo());
    }
}
