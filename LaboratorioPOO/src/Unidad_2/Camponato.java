package Unidad_2;

import java.util.ArrayList;

public class Camponato {
    private ArrayList<Equipo> fixture = new ArrayList<>();
    private ArrayList <Equipo> mañana = new ArrayList<>();
    private ArrayList <Equipo> tarde = new ArrayList<>();
    private ArrayList <Equipo> noche = new ArrayList<>();
    public ArrayList<Equipo> getFixture() {
        return fixture;
    }

    public void setFixture(ArrayList<Equipo> fixture) {
        this.fixture = fixture;
    }

    public Camponato(ArrayList<Equipo> fixture) {
        this.fixture = fixture;
    }

    public ArrayList<Equipo> getNoche() {
        return noche;
    }

    public void setNoche(ArrayList<Equipo> noche) {
        this.noche = noche;
    }

    public ArrayList<Equipo> getTarde() {
        return tarde;
    }

    public void setTarde(ArrayList<Equipo> tarde) {
        this.tarde = tarde;
    }

    public ArrayList<Equipo> getMañana() {
        return mañana;
    }

    public void setMañana(ArrayList<Equipo> mañana) {
        this.mañana = mañana;
    }

    public Camponato(ArrayList<Equipo> fixture, ArrayList<Equipo> mañana, ArrayList<Equipo> tarde, ArrayList<Equipo> noche) {
        this.fixture = fixture;
        this.mañana = mañana;
        this.tarde = tarde;
        this.noche = noche;
    }

    public boolean hay11 (Equipo otroEquipo){
        boolean hay11=false;
        if (otroEquipo.jugadores.size()==11)hay11= true;
        else hay11=false;
        return  hay11;
    }

    public void generarHorario()
    {
        for (int i = 0; i < fixture.size(); i++) {
                if (fixture.get(i).getDisponibilidad().equals("Mañana"))mañana.add(fixture.get(i));
                else if(fixture.get(i).getDisponibilidad()== "Tarde")tarde.add(fixture.get(i));
                else if(fixture.get(i).getDisponibilidad()== "Noche")noche.add(fixture.get(i));
            }

    }
    public void generarFixtureMañana()
    {
        for (int i = 0; i < mañana.size(); i++) {
            for (int j = i+1; j < mañana.size(); j++) {
                System.out.println("El equipo local es "+ mañana.get(i).getNombre()+ mañana.get(j).getNombre());
                  }
                    }
    }
    public void generarFixtureTarde()
    {
        for (int i = 0; i < tarde.size(); i++) {
            for (int j = i+1; j < tarde.size(); j++) {
                System.out.println("El equipo local es "+ tarde.get(i).getNombre()+ tarde.get(j).getNombre());
            }
        }
    }
    public void generarFixtureNoche()
    {
        for (int i = 0; i < noche.size(); i++) {
            for (int j = i+1; j < noche.size(); j++) {
                System.out.println("El equipo local es "+ noche.get(i).getNombre()+ noche.get(j).getNombre());
            }
        }
    }
}
