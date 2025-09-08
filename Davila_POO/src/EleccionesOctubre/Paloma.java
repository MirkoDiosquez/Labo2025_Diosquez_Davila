package EleccionesOctubre;

public class Paloma extends Ave implements Campania{
    private boolean sabeVolar;
    @Override
    public String hacerCampania() {
        if (sabeVolar)return "Lanzando un papelito que dice: Vote por el partido para un mejor futuro";
        else return "No sabe volar";
    }
}
