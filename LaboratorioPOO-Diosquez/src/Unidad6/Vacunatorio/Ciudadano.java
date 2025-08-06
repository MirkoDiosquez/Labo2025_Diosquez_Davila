package Unidad6.Vacunatorio;

import java.util.HashSet;

public class Ciudadano
{
    private int dni ;
    private String apellido ;
    private String nombre ;
    private String domicilio ;
    private String mail ;
    private Pronvincia provincia ;
    private HashSet<Vacuna> vacunas ;

    public Ciudadano(HashSet<Vacuna> vacunas, String mail, String domicilio, Pronvincia provincia, String nombre, String apellido, int dni) {
        this.vacunas = vacunas;
        this.mail = mail;
        this.domicilio = domicilio;
        this.provincia = provincia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pronvincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Pronvincia provincia) {
        this.provincia = provincia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(HashSet<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    public static void main(String[] args) {

    }

}
