package Unidad6.CreativoSInLimites;

public class Proyecto
{
    private String nombre ;
    private int idProyecto ;

    public Proyecto(String nombre, int idProyecto) {
        this.nombre = nombre;
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
}