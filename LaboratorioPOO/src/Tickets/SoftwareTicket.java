package Tickets;

import Unidad_1.Persona;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SoftwareTicket extends Ticket{
    Software software;
    private static int cantMaximaIntentos= 3;
    private int cantIntentos;

    public SoftwareTicket(Persona cliente, String descripcion, LocalDateTime horaCreacion, LocalDateTime horaFinalizacion, ArrayList<String> comentarios, Estado estado, Software software, int cantIntentos) {
        super(cliente, descripcion, horaCreacion, horaFinalizacion, comentarios, estado);
        this.software = software;
        this.cantIntentos = cantIntentos;
    }

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public static int getCantMaximaIntentos() {
        return cantMaximaIntentos;
    }

    public static void setCantMaximaIntentos(int cantMaximaIntentos) {
        SoftwareTicket.cantMaximaIntentos = cantMaximaIntentos;
    }

    public int getCantIntentos() {
        return cantIntentos;
    }

    public void setCantIntentos(int cantIntentos) {
        this.cantIntentos = cantIntentos;
    }

    public boolean resolver(){
        boolean resuelto= false;
        if (software.isParcheApliacble() && cantIntentos<cantMaximaIntentos && super.getEstado().equals(Estado.PROGRESO)) {
            resuelto = true;
            super.setEstado(Estado.RESUELTO);

        }
        return resuelto;
    }
}
