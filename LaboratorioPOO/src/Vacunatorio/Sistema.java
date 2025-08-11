package Vacunatorio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    HashMap<Integer, Ciudadano> ciudadanoHasMap= new HashMap<>();

    public Sistema(HashMap<Integer, Ciudadano> ciudadanoHasMap) {
        this.ciudadanoHasMap = ciudadanoHasMap;
    }

    public HashMap<Integer, Ciudadano> getCiudadanoHasMap() {
        return ciudadanoHasMap;
    }

    public void setCiudadanoHasMap(HashMap<Integer, Ciudadano> ciudadanoHasMap) {
        this.ciudadanoHasMap = ciudadanoHasMap;
    }
    public void addVacunaC(int dni, Vacuna v){
        ciudadanoHasMap.get(dni).getVacunasCiudadano().add(v);
    }
    public HashSet<Vacuna> historial(int dni){
        return ciudadanoHasMap.get(dni).getVacunasCiudadano();
    }
    public HashMap<Provincia, Integer> cantidadProvincia(){
        HashMap<Provincia, Integer> provinciaCant= new HashMap<>();
        for (Map.Entry<Integer, Ciudadano> valores: ciudadanoHasMap.entrySet()){
            Provincia p = valores.getValue().getProvincia();
            if (!provinciaCant.containsKey(p))provinciaCant.put(p, 1);
            else provinciaCant.put(p, provinciaCant.get(p)+1);
        }
        return provinciaCant;
    }
    public HashSet <Ciudadano> ciudadanosVacunaCumplen(int canti){
        HashSet<Ciudadano> cida = new HashSet<>();
        for (Map.Entry<Integer, Ciudadano> valores: ciudadanoHasMap.entrySet()){
            if (valores.getValue().cantVacunasCiudadano()== canti){
                cida.add(valores.getValue());
            }
        }
        return cida;
    }
    public HashSet<Ciudadano> vacunaDeterminada(Vacuna vacuna){
        HashSet<Ciudadano> integerCiudadanoHashMap = new HashSet<>();
        for (Map.Entry<Integer, Ciudadano> valores: ciudadanoHasMap.entrySet()){
            Ciudadano c= valores.getValue();
            if (c.getVacunasCiudadano().contains(vacuna))integerCiudadanoHashMap.add(c);
        }
        return  integerCiudadanoHashMap;
    }
}
