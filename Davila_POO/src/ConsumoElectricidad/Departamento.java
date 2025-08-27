package ConsumoElectricidad;

import DireccionClase.Direccion;

import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

public class Departamento  extends Vivienda{
    private int cantAmbientes;
    private static int valorConsumo=50;

    public Departamento(Direccion direccion, int codigoPostal, Dueño dueño, HashMap<YearMonth, Integer> consumo, int cantAmbientes) {
        super(direccion, codigoPostal, dueño, consumo);
        this.cantAmbientes = cantAmbientes;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
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
