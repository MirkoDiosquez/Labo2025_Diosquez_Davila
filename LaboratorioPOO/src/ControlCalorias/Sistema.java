package ControlCalorias;

import java.util.HashSet;

public class Sistema {
    public HashSet<Familia> familias = new HashSet<>();

    public Sistema(HashSet<Familia> familias) {
        this.familias = familias;
    }

    public HashSet<Familia> getFamilias() {
        return familias;
    }

    public void setFamilias(HashSet<Familia> familias) {
        this.familias = familias;
    }
    public double cantCaloriasProm()
    {

    }
}
