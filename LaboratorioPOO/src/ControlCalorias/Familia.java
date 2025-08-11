package ControlCalorias;

import Persona.Persona;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Familia {
    HashMap<Persona, HashSet<PlatoComido>> personas = new HashMap<>();

    public Familia(HashMap<Persona, HashSet<PlatoComido>> personas) {
        this.personas = personas;
    }

    public HashMap<Persona, HashSet<PlatoComido>> getPersonas() {
        return personas;
    }

    public void setPersonas(HashMap<Persona, HashSet<PlatoComido>> personas) {
        this.personas = personas;
    }

    public int totalCalorias(Persona p) {
        int calorias = 0;
        for (Map.Entry<Persona, HashSet<PlatoComido>> historial : personas.entrySet()) {
            Persona per = historial.getKey();
            HashSet<PlatoComido> platoComidoHashSet = historial.getValue();
            if (per.getNombre().equals(p.getNombre())) {
                for (PlatoComido platoComido : platoComidoHashSet) {
                    calorias += platoComido.getCantCalorias();
                }
            }
        }
        return calorias;
    }
    public Persona masCalorias(){
        Persona masCalorias = new Persona();
        for (Map.Entry<Persona, HashSet<PlatoComido>> historial : personas.entrySet()){
            Persona p = historial.getKey();
            if (totalCalorias(p)> totalCalorias(masCalorias))masCalorias= p;
        }
        return masCalorias;
    }
    public Persona menosCalorias(){
        Persona menosCalorias = new Persona();
        for (Map.Entry<Persona, HashSet<PlatoComido>> historial : personas.entrySet()){
            Persona p = historial.getKey();
            if (totalCalorias(p)> totalCalorias(menosCalorias))menosCalorias= p;
        }
        return menosCalorias;
    }
    public double promCalorias(){
        double promedio=0;
        for (Map.Entry<Persona, HashSet<PlatoComido>> historial : personas.entrySet()){
            Persona p = historial.getKey();
            promedio +=totalCalorias(p);
        }
        return promedio;
    }
}
