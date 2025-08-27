package ConsumoElectricidad;

import DireccionClase.Direccion;

import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

public class Casa extends Vivienda{
    private double metrosCubiertos;
    private double metrosDescubiertos;
    private static int valorConsumo=100;

    public Casa(Direccion direccion, int codigoPostal, Dueño dueño, HashMap<YearMonth, Integer> consumo, double metrosCubiertos, double metrosDescubiertos) {
        super(direccion, codigoPostal, dueño, consumo);
        this.metrosCubiertos = metrosCubiertos;
        this.metrosDescubiertos = metrosDescubiertos;
    }

    public double getMetrosCubiertos() {
        return metrosCubiertos;
    }

    public void setMetrosCubiertos(double metrosCubiertos) {
        this.metrosCubiertos = metrosCubiertos;
    }

    public double getMetrosDescubiertos() {
        return metrosDescubiertos;
    }

    public void setMetrosDescubiertos(double metrosDescubiertos) {
        this.metrosDescubiertos = metrosDescubiertos;
    }
    public int calcularConsumo(){
        int pago=0;
        for (Map.Entry<YearMonth, Integer> valores: super.getConsumo().entrySet()){
            int kw= valores.getValue();
            pago+=kw*valorConsumo;
        }
        return pago;
    }
}
