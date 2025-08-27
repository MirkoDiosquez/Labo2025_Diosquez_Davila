package Unidad6.ControlAltura;

import java.time.LocalDate;
import java.util.HashSet;

public class Sistema
{
    private HashSet<Paciente> pacientes ;

    public Sistema(HashSet<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(HashSet<Paciente> pacientes) {
        this.pacientes = pacientes;
    }


    public void conocer (int AuxDNi, LocalDate AuxFecha)
    {
        for(Paciente p : pacientes)
        {
            //if (p.getDni() == AuxDNi || p.getNON().keySet() == AuxFecha)
            {

            }
        }
    }
}
