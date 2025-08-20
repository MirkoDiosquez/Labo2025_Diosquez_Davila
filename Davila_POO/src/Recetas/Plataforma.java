package Recetas;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Plato> platos;

    public Plataforma(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
    private void addPlato(Plato nuevoPlato){
        platos.add(nuevoPlato);
    }
    private void removePlato(Plato removePlato){
        platos.remove(removePlato);
    }
    private void modifyPlato(Plato nuevo, Plato feo){
        removePlato(feo);
        addPlato(nuevo);
    }
    private ArrayList<Plato> platoSegunDificultad(String dificultad){
        ArrayList<Plato> platosDificultad= new ArrayList<>();
        for (Plato plato:platos){
            if (plato.getDificultad().equals(dificultad))platosDificultad.add(plato);
        }
    return platosDificultad;
    }
    public int cantTotalRecetas(){
        return platos.size();
    }
    public Plato platoMayorPasos() {
        Plato platoMay = platos.getFirst();
        for (Plato plato:platos) {
        if (plato.getPasos().size() > platoMay.getPasos().size()) platoMay =plato;
    }
    return platoMay;
    }
    public ArrayList<Plato> recetasTipo(String tipo){
        ArrayList<Plato>platosTipo=new ArrayList<>();
        for (Plato p: platos){
            if (p.getClass().equals(tipo))platosTipo.add(p);
        }
        return platosTipo;
    }
    public ArrayList<Plato> recetasTipoDesafio(Plato platoFiltrado){
        ArrayList<Plato>platosTipo=new ArrayList<>();
        for (Plato p: platos){
            if (p.esDeltipo(platoFiltrado))platosTipo.add(p);
        }
        return platosTipo;
    }


}
