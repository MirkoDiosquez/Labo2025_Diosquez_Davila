package Poblacion;

import java.util.HashSet;

public class Pais extends  Lugar{
    private HashSet<Estado> estados = new HashSet<>();

    public Pais(String nombre, int codigo, Coordenadas coordenadas, HashSet<Estado> estados) {
        super(nombre, codigo, coordenadas);
        this.estados = estados;
    }
    public Pais(){
        super("sp", 1, new Coordenadas());
        this.estados=null;
    }

    public HashSet<Estado> getEstados() {
        return estados;
    }

    public void setEstados(HashSet<Estado> estados) {
        this.estados = estados;
    }

    public void addLugar(Estado l){
        estados.add(l);
    }
    public void removeLugar(Estado l){
        estados.remove(l);
    }
    public void modifyL(Estado lN, Estado lR){
        removeLugar(lR);
        addLugar(lN);
    }
    public int cantPoblacion(){
        int cantidad=0;
        for (Estado e: estados){
            cantidad+=e.cantPoblacion();
        }
        return cantidad;
    }
}
