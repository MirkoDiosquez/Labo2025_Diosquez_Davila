package Sistema_de_Viviendas;

import java.time.Year;
import java.time.YearMonth;
import java.util.HashMap;

public class Casa extends Vivienda
{
    private float metrosCubiertos ;
    private float metrosNoCubiertos ;

    public Casa(String direccion, int codigoPostal, Persona dueño, HashMap<YearMonth, Integer> consumo, int costo, float metrosCubiertos, float metrosNoCubiertos) {
        super(direccion, codigoPostal, dueño, consumo, costo);
        this.metrosCubiertos = metrosCubiertos;
        this.metrosNoCubiertos = metrosNoCubiertos;
    }

    public float getMetrosCubiertos() {
        return metrosCubiertos;
    }

    public void setMetrosCubiertos(float metrosCubiertos) {
        this.metrosCubiertos = metrosCubiertos;
    }

    public float getMetrosNoCubiertos() {
        return metrosNoCubiertos;
    }

    public void setMetrosNoCubiertos(float metrosNoCubiertos) {
        this.metrosNoCubiertos = metrosNoCubiertos;
    }
}
