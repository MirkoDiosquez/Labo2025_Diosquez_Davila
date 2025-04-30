package Unidad_2;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String barrio;
    private String Disponibilidad;
    ArrayList<Jugador> jugadores = new ArrayList<>();

    public Equipo(String nombre, String barrio, String disponibilidad, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.barrio = barrio;
        this.Disponibilidad = disponibilidad;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        Disponibilidad = disponibilidad;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public boolean comprobarCapitan(){
        boolean capitan= false;
        int contador=0;
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).isCapitan())
            {
                capitan = true;
                contador+=1;
            }
        }if (contador!= 1)return false;
        return  capitan;

    }
}
