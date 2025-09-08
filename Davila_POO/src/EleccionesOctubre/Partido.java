package EleccionesOctubre;

import DireccionClase.Direccion;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private Direccion direccion;
    private int cantAfiliados;
    private HashSet<Campania> enviadores;

    public void addMensajero(Campania mensajero){
        enviadores.add(mensajero);
    }
    public void hacerCampaña(){
        for (Campania m: enviadores){
            System.out.println(m.hacerCampania()+" Vote por el partido para un mejor futuro");
        }
    }
}
