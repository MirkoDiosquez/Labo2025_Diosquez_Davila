package Poblacion;

import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais> paises = new HashSet<>();

    public Continente(String nombre, int codigo, Coordenadas coordenadas, HashSet<Pais> paises) {
        super(nombre, codigo, coordenadas);
        this.paises = paises;
    }
    public Continente(){
        super("m", 1, 1, 2);
        this.paises=null;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    public void addLugar(Pais P){
        paises.add(P);
    }

    public void removeLugar(Pais l){
        paises.remove(l);
    }
    public void modifyL(Pais lN, Pais lR){
        removeLugar(lR);
        addLugar(lN);
    }
    public int cantPoblacion(){
        int cantidad=0;
        for (Pais p:paises){
            cantidad+=p.cantPoblacion();
        }
        return cantidad;
    }
    public Pais mayorPoblacion(){
        Pais masPoblado = new Pais();
        for (Pais p: paises){
            if (p.cantPoblacion()> masPoblado.cantPoblacion())masPoblado=p;
        }
        return masPoblado;
    }
    public Pais menorPoblacion(){
        Pais menosPoblado = new Pais();
        for (Pais p: paises){
            if (p.cantPoblacion()< menosPoblado.cantPoblacion())menosPoblado=p;
        }
        return menosPoblado;
    }
}
