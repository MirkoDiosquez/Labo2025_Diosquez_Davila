package CampeonatoArcoFlecha;

import java.util.HashMap;
import java.util.Map;

public abstract class Diana {
    private String nombre;
    private Nivel dificultad;
    private HashMap<Integer, Color> puntajes;


    public Diana(String nombre, Nivel dificultad, HashMap<Integer, Color> puntajes) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.puntajes = puntajes;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nivel getDificultad() {
        return dificultad;
    }

    public void setDificultad(Nivel dificultad) {
        this.dificultad = dificultad;
    }

    public HashMap<Integer, Color> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(HashMap<Integer, Color> puntajes) {
        this.puntajes = puntajes;
    }

    public abstract double calcularArea();


     public double calcularPuntosDiana(){
         double cantidadPuntos = 0;
         for (Map.Entry<Integer, Color> valores: puntajes.entrySet()){
             cantidadPuntos = valores.getKey()*valores.getValue().getPuntos();
         }
         return cantidadPuntos;
     }
}
