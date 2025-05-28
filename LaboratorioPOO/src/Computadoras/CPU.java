package Computadoras;

import Unidad_1.Persona;

public class CPU extends Componente{
    private int tamaño;

    public CPU(Persona fabricante, String modelo, int precio, int stock, int tamaño) {
        super(fabricante, modelo, precio, stock);
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}
