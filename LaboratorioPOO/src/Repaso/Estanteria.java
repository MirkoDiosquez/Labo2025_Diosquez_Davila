package Repaso;

import java.util.ArrayList;

public class Estanteria {
    ArrayList<Pelicula> estanteria = new ArrayList<>();

    public Estanteria(ArrayList<Pelicula> estanteria) {
        this.estanteria = estanteria;
    }

    public ArrayList<Pelicula> getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(ArrayList<Pelicula> estanteria) {
        this.estanteria = estanteria;
    }
    public Pelicula mayDuracion(){
        Pelicula pelimayorDuracion = estanteria.getFirst();
        for (Pelicula estanterias: estanteria){
            if (estanterias.getDuracion()> pelimayorDuracion.getDuracion())pelimayorDuracion=estanterias;
        }
    return  pelimayorDuracion;
    }
    public void actoresCant(){
        int contador=0;
        for (int i = 0; i < estanteria.size(); i++) {
            for (int j = 0; j < estanteria.size(); j++) {
                if (estanteria.get(i).getDirectores()==estanteria.get(j).getDirectores()){
                    contador++;
                }
            }
        }
        for (int i = 0; i < estanteria.size(); i++) {
            if (contador>2) System.out.println(estanteria.get(i).getDirectores());

        }
    }
}
