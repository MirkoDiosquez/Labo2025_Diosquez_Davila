package Poblacion;

import java.util.HashSet;

public class Mundo extends Lugar{
    private HashSet<Continente> continentes = new HashSet<>();

    public Mundo(String nombre, int codigo, Coordenadas coordenadas, HashSet<Continente> continentes) {
        super(nombre, codigo, coordenadas);
        this.continentes = continentes;
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public void addLugar(Continente l){
        continentes.add(l);
    }

    public void removeLugar(Continente l){
        continentes.remove(l);
    }
    public void modifyL(Continente lN, Continente lR){
        removeLugar(lR);
        addLugar(lN);
    }
    public int cantPoblacion(){
        int cantidad=0;
        for (Continente c: continentes){
            cantidad+=c.cantPoblacion();
        }
        return cantidad;
    }
    public Continente menorPoblacion(){
        Continente menosPoblado = new Continente();
        for (Continente c: continentes){
            if (c.cantPoblacion()< menosPoblado.cantPoblacion())menosPoblado=c;
        }
        return menosPoblado;
    }
    public Continente mayorPoblado(){
        Continente masPoblado = new Continente();
        for (Continente c: continentes){
            if (c.cantPoblacion()> masPoblado.cantPoblacion())masPoblado=c;
        }
        return masPoblado;
    }
}
