package Vacunatorio;

import DireccionClase.Direccion;
import Persona.Persona;

import java.util.HashSet;

public class Ciudadano extends Persona {
    private int dni;
    private Provincia provincia;
    private String mail;
    private HashSet<Vacuna> vacunasCiudadano= new HashSet<>();

    public Ciudadano(String nombre, int edad, Direccion direccion, int dni, Provincia provincia, String mail, HashSet<Vacuna> vacunasCiudadano) {
        super(nombre, edad, direccion);
        this.dni = dni;
        this.provincia = provincia;
        this.mail = mail;
        this.vacunasCiudadano = vacunasCiudadano;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Vacuna> getVacunasCiudadano() {
        return vacunasCiudadano;
    }

    public void setVacunasCiudadano(HashSet<Vacuna> vacunasCiudadano) {
        this.vacunasCiudadano = vacunasCiudadano;
    }
    public int cantVacunasCiudadano(){
        return this.vacunasCiudadano.size();
    }

}
