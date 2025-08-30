package Tickets;

import Unidad_1.Persona;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Ticket {
    private Persona cliente;
    private String descripcion;
    private LocalDateTime horaCreacion;
    private LocalDateTime horaFinalizacion;
    private ArrayList<String> comentarios = new ArrayList<>();
    private Estado estado;
    private Desarrollador desarrollador;

    abstract boolean resolver();

    public Ticket(Persona cliente, String descripcion, LocalDateTime horaCreacion, LocalDateTime horaFinalizacion, ArrayList<String> comentarios, Estado estado) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.horaCreacion = horaCreacion;
        this.horaFinalizacion = horaFinalizacion;
        this.comentarios = comentarios;
        this.estado = estado;
    }



    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public LocalDateTime getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(LocalDateTime horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setComentariosD(){
        comentarios.add(desarrollador.agregarComentario());
    }

}
