package Poblacion;

import java.util.HashSet;

public class Sistema {
    private HashSet<Lugar> lugares = new HashSet<>();

    public Sistema(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }

    public HashSet<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }
    public void addLugar(Lugar l){
        for (Lugar ls: lugares){
            if (ls.getCodigo() == l.getCodigo())
        }
    }
    public void removeLugar(Lugar l){
        lugares.remove(l);
    }
    public void modifyL(Lugar lN, Lugar lR){
        removeLugar(lR);
        addLugar(lN);
    }
}
