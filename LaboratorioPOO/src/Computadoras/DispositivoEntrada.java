package Computadoras;

import Unidad_1.Persona;

import java.util.ArrayList;

public class DispositivoEntrada extends Componente{
    private String tipoConector;
    private ArrayList<String> puertos=new ArrayList<>();

    public DispositivoEntrada(Persona fabricante, String modelo, int precio, int stock, String tipoConector, ArrayList<String> puertos) {
        super(fabricante, modelo, precio, stock);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public ArrayList<String> getPuertos() {
        return puertos;
    }

    public void setPuertos(ArrayList<String> puertos) {
        this.puertos = puertos;
    }
}
