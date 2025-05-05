package Unidad2;


import java.util.Random;
import java.util.ArrayList;

public class Curling {

    private ArrayList<Equipo> equipos;
    private ArrayList<Jugador> jugadores;

    // Constructor
    public Curling() {
        this.equipos = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo)
    {
        equipos.add(equipo);
    }

    public int generarMarcador()
    {
        Random rand = new Random();
        return rand.nextInt(5) ;
    }

    public void fixture ()
    {
        System.out.println("Partidos de turno " + equipos.get(1).getHorario());
        System.out.println("PARTIDOS:");
        for(int i = 0 ; i < equipos.size() ; i++ )
        {
           for (int j = i+1 ; j < equipos.size() ; j ++)
           {
                System.out.println( equipos.get(i).getNombre_equipo() +" "+generarMarcador() + " - " +generarMarcador() +" " +equipos.get(j).getNombre_equipo() );
           }
        }
        System.out.println("--------------------------------");
    }



    public static void main(String[] args) {

        Curling torneo = new Curling();
        Curling torneo2 = new Curling();
        Curling torneo3 = new Curling();


        torneo.agregarEquipo(new Equipo("River", "Nuñez", "mañana"));
        torneo.agregarEquipo(new Equipo("Boca", "La Boca", "mañana"));
        torneo.agregarEquipo(new Equipo("Independiente", "Avellaneda", "mañana"));
        torneo.agregarEquipo(new Equipo("Racing", "Avellaneda", "mañana"));
        torneo.agregarEquipo(new Equipo("San Lorenzo", "Boedo", "mañana"));

        torneo2.agregarEquipo(new Equipo("Huracán", "Parque Patricios", "tarde"));
        torneo2.agregarEquipo(new Equipo("Lanús", "Lanús", "tarde"));
        torneo2.agregarEquipo(new Equipo("Tigre", "Victoria", "tarde"));
        torneo2.agregarEquipo(new Equipo("Vélez", "Liniers", "tarde"));
        torneo2.agregarEquipo(new Equipo("Argentinos Juniors", "La Paternal", "tarde"));

        torneo3.agregarEquipo(new Equipo("Estudiantes", "La Plata", "noche"));
        torneo3.agregarEquipo(new Equipo("Gimnasia", "La Plata", "noche"));
        torneo3.agregarEquipo(new Equipo("Newell's", "Rosario", "noche"));
        torneo3.agregarEquipo(new Equipo("Rosario Central", "Rosario", "noche"));
        torneo3.agregarEquipo(new Equipo("Colón", "Santa Fe", "noche"));

        torneo.fixture() ;
        torneo2.fixture() ;
        torneo3.fixture() ;

    }
}
