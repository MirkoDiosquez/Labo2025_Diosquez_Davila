package Repaso;

import java.util.ArrayList;

public class Videoclub {
    private ArrayList<Estanteria> estanterias = new ArrayList<>();
    private String direccion;
    private int codigoPostal;
    private int cantEstanterias;
    private String comuna;


    public Videoclub(ArrayList<Estanteria> estanterias, String direccion, int codigoPostal, int cantEstanterias, String comuna) {
        this.estanterias = estanterias;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.cantEstanterias = cantEstanterias;
        this.comuna=comuna;
    }

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setPeliculas(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getCantEstanterias() {
        return cantEstanterias;
    }

    public void setCantEstanterias() {
        this.cantEstanterias = estanterias.size();
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    private void mostrarMayorDuracionPeliculas() {
        Pelicula mayorTiempo = estanterias.getFirst().mayDuracion();
        int contador = 0;
        for (Estanteria estanteria : estanterias) {
        if (estanteria.mayDuracion().getDuracion() > mayorTiempo.getDuracion()){
            mayorTiempo= estanteria.mayDuracion();
        }
        contador++;
        }
        System.out.println("La pelicula con mayor duracion es " + mayorTiempo.getNombre() + contador);
    }
    public int cantidadPeliculasVideoClub()
    {
        int contador=0;
        for (Estanteria estanteria:estanterias)
        {
            for (Pelicula pelicula: estanteria.getPeliculas()) contador++;
        }
    return  contador;
    }
    public void mostrarGenero(String genero)
    {
        for (Estanteria estanteria:estanterias){
            for (Pelicula pelicula: estanteria.getPeliculas()){
                if (genero.toUpperCase()== pelicula.getGenero().toUpperCase()) System.out.println("La pelicula que tiene el genero "+ genero + "es " + pelicula.getNombre());
            }
        }
    }
}