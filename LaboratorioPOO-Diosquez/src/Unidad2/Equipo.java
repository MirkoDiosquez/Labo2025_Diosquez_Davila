package Unidad2;

public class Equipo
{
    private String nombre_equipo ;
    private String bario ;
    private String horario ;

    public Equipo (String nombre_equipo, String bario, String horario )
    {
        this.bario = bario ;
        this.nombre_equipo = nombre_equipo ;
        this.horario = horario ;
    }

    // Getters
    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public String getBario() {
        return bario;
    }

    public String getHorario() {
        return horario;
    }

    // Setters
    public void setBario(String bario) {
        this.bario = bario;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
