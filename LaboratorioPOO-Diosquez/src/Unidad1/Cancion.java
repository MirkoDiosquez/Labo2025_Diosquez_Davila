package Unidad1;

public class Cancion {

    private String titulo;
    private String autor;

    // Constructor por defecto
    public Cancion()
    {
        this.titulo = "No ando solo ";
        this.autor = "Bryant Myers";
    }

    // Constructor parametrizado
    public Cancion(String titulo, String autor)
    {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters
    public String getTitulo()
    {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    // Setters
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }
}
