package Unidad2;

import java.util.ArrayList;

public class Curling {

    private ArrayList<Equipo> equipos;
    private ArrayList<Jugador> jugadores;

    public Curling() {
        this.equipos = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo)
    {
        equipos.add(equipo);
    }

    public static void main(String[] args) {
        Curling torneo = new Curling();

        torneo.agregarEquipo(new Equipo("River", "Nuñez", "mañana"));
        torneo.agregarEquipo(new Equipo("Boca", "La Boca", "mañana"));
        torneo.agregarEquipo(new Equipo("Independiente", "Avellaneda", "mañana"));
        torneo.agregarEquipo(new Equipo("Racing", "Avellaneda", "mañana"));
        torneo.agregarEquipo(new Equipo("San Lorenzo", "Boedo", "mañana"));

        torneo.agregarEquipo(new Equipo("Huracán", "Parque Patricios", "tarde"));
        torneo.agregarEquipo(new Equipo("Lanús", "Lanús", "tarde"));
        torneo.agregarEquipo(new Equipo("Tigre", "Victoria", "tarde"));
        torneo.agregarEquipo(new Equipo("Vélez", "Liniers", "tarde"));
        torneo.agregarEquipo(new Equipo("Argentinos Juniors", "La Paternal", "tarde"));

        torneo.agregarEquipo(new Equipo("Estudiantes", "La Plata", "noche"));
        torneo.agregarEquipo(new Equipo("Gimnasia", "La Plata", "noche"));
        torneo.agregarEquipo(new Equipo("Newell's", "Rosario", "noche"));
        torneo.agregarEquipo(new Equipo("Rosario Central", "Rosario", "noche"));
        torneo.agregarEquipo(new Equipo("Colón", "Santa Fe", "noche"));

    }
}
