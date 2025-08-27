package ConsumoElectricidad;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Vivienda> viviendas;
//    private static HashMap<Tipo, Integer> aplicarConsumo = metodoAplicarConsumo();
    public Sistema(HashSet<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }
/*    public static HashMap<Tipo, Integer> metodoAplicarConsumo(){
        HashMap<Tipo, Integer> aux= new HashMap<>();
        aux.put(Tipo.CASA, 100);
        aux.put(Tipo.DEPARTAMENTO, 50);
        return aux;

    }

 */
    public HashSet<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(HashSet<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

}

