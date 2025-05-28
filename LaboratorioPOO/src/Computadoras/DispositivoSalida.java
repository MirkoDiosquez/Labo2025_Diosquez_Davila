package Computadoras;

import Unidad_1.Persona;

import java.util.ArrayList;

public class DispositivoSalida extends  Componente{
    private ArrayList<String>puertos= new ArrayList<>();

    public DispositivoSalida(Persona fabricante, String modelo, int precio, int stock, ArrayList<String> puertos) {
        super(fabricante, modelo, precio, stock);
        this.puertos = puertos;
    }

    public ArrayList<String> getPuertos() {
        return puertos;
    }

    public void setPuertos(ArrayList<String> puertos) {
        this.puertos = puertos;
    }
}
