package Computadoras;

import Unidad_1.Persona;

public class Cliente extends Persona {
    private int celular;


    public Cliente(String nombre, int edad, String direccion, int celular) {
        super(nombre, edad, direccion);
        this.celular = celular;

    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }


}
