package Sistema_de_Viviendas;

import java.time.YearMonth;
import java.util.HashMap;
import java.util.PropertyResourceBundle;

public class Vivienda
{
    private String direccion ;
    private int codigoPostal ;
    private Persona dueño ;
    private HashMap<YearMonth,Integer> consumo ; // Int son los KWh
    private int costo ;

    public Vivienda(String direccion, int codigoPostal, Persona dueño, HashMap<YearMonth, Integer> consumo, int costo) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.dueño = dueño;
        this.consumo = consumo;
        this.costo = costo;
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

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public HashMap<YearMonth, Integer> getConsumo() {
        return consumo;
    }

    public void setConsumo(HashMap<YearMonth, Integer> consumo) {
        this.consumo = consumo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void cargarConsumo(int K)
    {
        consumo.put(YearMonth.now(),K) ;
    }

    public void calcularPrecio(YearMonth auxY)
    {
        if (consumo.containsKey(auxY))
        {
            if()
            {

            }
        }
    }

    public static void main(String[] args) {

    }

}
