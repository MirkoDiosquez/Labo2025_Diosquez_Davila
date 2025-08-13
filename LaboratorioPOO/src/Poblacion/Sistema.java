package Poblacion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashMap<Integer, Lugar> lugares = new HashMap<>();

    public Sistema(HashMap<Integer, Lugar> lugares) {
        this.lugares = lugares;
    }

    public HashMap<Integer, Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(HashMap<Integer, Lugar> lugares) {
        this.lugares = lugares;
    }

    public int cantPoblacionCodigo(int codigo){
        int cantidad=0;
        for (Map.Entry<Integer, Lugar> valor: lugares.entrySet()){
            if (valor.getKey() == codigo)cantidad=valor.getValue().cantPoblacion();
        }
        return cantidad;
    }
}
