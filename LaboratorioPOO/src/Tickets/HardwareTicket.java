package Tickets;

import Per.Persona;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class HardwareTicket extends Ticket{
    private Dispositivo dispositivo;

    public HardwareTicket(Persona cliente, String descripcion, LocalDateTime horaCreacion, LocalDateTime horaFinalizacion, ArrayList<String> comentarios, Estado estado, Dispositivo dispositivo) {
        super(cliente, descripcion, horaCreacion, horaFinalizacion, comentarios, estado);
        this.dispositivo = dispositivo;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    public boolean resolver(){
        boolean resuelto=false;
        if (dispositivo.getRepuestosDisponibles()>0 )
        {
            resuelto=true;
                if (super.getEstado().equals(Estado.PROGRESO)){
                    super.setEstado(Estado.RESUELTO);
                }


        }
        return resuelto;
    }
}
