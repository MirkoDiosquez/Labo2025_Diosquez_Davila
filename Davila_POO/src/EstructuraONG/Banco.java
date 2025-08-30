package EstructuraONG;

import java.util.HashSet;

public class Banco {
    private String nombre;
    HashSet<Asalariados> usuarios;

    public Banco(String nombre, HashSet<Asalariados> usuarios) {
        this.nombre = nombre;
        this.usuarios = usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Asalariados> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Asalariados> usuarios) {
        this.usuarios = usuarios;
    }
}
