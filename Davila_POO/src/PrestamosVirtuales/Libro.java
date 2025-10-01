package PrestamosVirtuales;

import Fecha.Fecha;

public class Libro extends Publicacion  {
    private boolean saga;
    private static  int multa= 7500;

    public Libro(String titulo, Autor autor, Fecha fechaPublicacion, int stock, boolean saga) {
        super(titulo, autor, fechaPublicacion, stock);
        this.saga = saga;
    }
    public int mostrarMULTA(){
        return multa;
    }

    public String toString() {
        return "Libro";
    }
    public int mostrarMulta(){
        return multa;
    }
}
