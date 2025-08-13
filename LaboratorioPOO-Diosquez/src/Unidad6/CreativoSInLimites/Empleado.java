package Unidad6.CreativoSInLimites;

abstract class Empleado
{
    private int dni ;
    private String nombre ;
    private String apellido ;

    public Empleado(String apellido, String nombre, int dni)
    {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
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
