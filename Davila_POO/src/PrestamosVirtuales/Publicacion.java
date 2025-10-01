package PrestamosVirtuales;

import Fecha.Fecha;

public abstract class Publicacion {
    private String titulo;
    private Autor autor;
    private Fecha fechaPublicacion;
    private int stock;

    public Publicacion(String titulo, Autor autor, Fecha fechaPublicacion, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    abstract int mostrarMulta();
}
