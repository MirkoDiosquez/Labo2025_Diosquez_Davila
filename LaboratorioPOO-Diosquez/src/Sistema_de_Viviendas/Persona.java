package Sistema_de_Viviendas;

public class Persona
{
    private int dni ;
    private String nombre ;
    private String apellido ;

    public Persona(String nombre, String apellido, int dni) {
        this.dni = dni ;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
