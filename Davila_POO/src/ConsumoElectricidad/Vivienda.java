package ConsumoElectricidad;

import DireccionClase.Direccion;

import java.time.YearMonth;
import java.util.HashMap;

public abstract class Vivienda {
    private Direccion direccion;
    private int codigoPostal;
    private Dueño dueño;
    private HashMap<YearMonth, Integer> consumo;

    public Vivienda(Direccion direccion, int codigoPostal, Dueño dueño, HashMap<YearMonth, Integer> consumo) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.dueño = dueño;
        this.consumo = consumo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }


    public HashMap<YearMonth, Integer> getConsumo() {
        return consumo;
    }

    public void setConsumo(HashMap<YearMonth, Integer> consumo) {
        this.consumo = consumo;
    }
    public boolean cargarConsumo(YearMonth añoMesCarga, int consumoMes){
        if (!this.consumo.containsKey(añoMesCarga)){
            this.consumo.put(añoMesCarga, consumoMes);
            return true;
        }
        return false;
    }
    abstract int calcularConsumo();

}
