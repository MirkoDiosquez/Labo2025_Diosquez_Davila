package Unidad6.ControlAltura;
import Unidad1.Persona;
import java.time.LocalDate;
import java.util.HashMap;

public class Paciente extends Persona
{
    private int dni ;
    private LocalDate fechaNacimiento ;
    private HashMap<LocalDate,Registro> registro ;

    public Paciente(String direccion, String nombre, String apellido, int edad, int dni, LocalDate fechaNacimiento, HashMap<LocalDate, Registro> registro) {
        super(direccion, nombre, apellido, edad);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.registro = registro;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HashMap<LocalDate, Registro> getregistro() {
        return registro;
    }

    public void setregistro(HashMap<LocalDate, Registro> registro) {
        this.registro = registro;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void conocer (LocalDate AuxFecha)
    {
        if (registro.containsKey(AuxFecha))
        {
            System.out.println("El peso de la fecha que solicitó es: " +registro.get(AuxFecha).getPeso() );
            System.out.println("La altura de la fecha que solicitó es: " +registro.get(AuxFecha).getAltura() );
        }
    }

    public void promedio ()
    {
        //if(registro.get())
    }

    public void porce (LocalDate F1 , LocalDate F2)
    {
        int aux = 0 ;
        if (registro.containsKey(F1) || registro.containsKey(F2))
        {
            aux = ( registro.get(F1).getAltura() - registro.get(F2).getAltura()) / registro.get(F2).getAltura() * 100;
        }
        System.out.println("El porcentaje de crecimiento es de: %" +aux);
    }
}
