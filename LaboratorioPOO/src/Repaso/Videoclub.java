package Repaso;

import java.util.ArrayList;

public class Videoclub {
    private ArrayList<Estanteria> estanterias = new ArrayList<>();
    private String direccion;
    private int codigoPostal;
    private int cantEstanterias;


    public Videoclub(ArrayList<Estanteria> estanterias, String direccion, int codigoPostal, int cantEstanterias) {
        this.estanterias = estanterias;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.cantEstanterias = cantEstanterias;
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
}