package Poblacion;

import java.util.HashSet;

public class Estado extends Lugar{
    private HashSet<Ciudad> ciudades = new HashSet<>();

    public Estado(String nombre, int codigo, Coordenadas coordenadas, HashSet<Ciudad> ciudades) {
        super(nombre, codigo, coordenadas);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void addLugar(Ciudad l){
        ciudades.add(l);
    }
    public void removeLugar(Lugar l){
        ciudades.remove(l);
    }
    public void modifyL(Ciudad lN, Ciudad lR){
        removeLugar(lR);
        addLugar(lN);
    }
    public int cantPoblacion(){
        int cantidad=0;
        for (Ciudad c: ciudades){
            cantidad+=c.cantPoblacion();
        }
        return cantidad;
    }
}
