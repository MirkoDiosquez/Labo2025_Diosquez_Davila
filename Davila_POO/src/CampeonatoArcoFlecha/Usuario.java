package CampeonatoArcoFlecha;

import personas.Persona;

import java.time.LocalDate;

public class Usuario extends Persona {

    public Usuario(String nom, String apellido, LocalDate nacimiento) {
        super(nom, apellido, nacimiento);
    }
}
