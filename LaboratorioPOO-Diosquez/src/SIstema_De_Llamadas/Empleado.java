package SIstema_De_Llamadas;

public class Empleado extends Persona{
    private String pais;
    private int dni;
    private int telefono;

    public Empleado (String nombre, String apellido, int telefono, int dni, String pais){
        super(nombre, apellido);
        this.pais= pais;
        this.dni= dni;
        this.telefono= telefono;
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public String getPais() {
        return pais;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
