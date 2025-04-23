package Unidad_1;
public class Libro {
    private String titulo;
    private Persona persona;
    private int ISBN;
    private int paginas;
    private String editorial;
    private Fecha fechaPublicacion;

    public Libro(String titulo, Persona persona, int ISBN, int paginas, String editorial, Fecha fechaPublicacion){
        this.titulo = titulo;
        this.persona = persona;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getPersona() {
        return persona;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
   /* public boolean fechaAnterior(Libro libro2){
        if (this.fechaPublicacion < libro2.fechaPublicacion.anio) return true;
        if (this.fechaPublicacion.anio == libro2.fechaPublicacion.anio && this.fechaPublicacion.mes < libro2.fechaPublicacion.mes) return true;
        if (this.fechaPublicacion.anio == libro2.fechaPublicacion.anio && this.fechaPublicacion.mes == libro2.fechaPublicacion.mes && this.fechaPublicacion.dia < libro2.fechaPublicacion.dia) return true;
        return false;
    }*/

}
