package Poblacion;

import java.util.HashMap;

public class Lugar {
    private String nombre;
    private int codigo;
    private Coordenadas coordenadas;

    public Lugar(String nombre, int codigo, Coordenadas coordenadas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }
}
