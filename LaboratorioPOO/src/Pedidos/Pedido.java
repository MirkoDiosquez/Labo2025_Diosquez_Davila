package Pedidos;

import Unidad_1.Persona;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pedido {
    private LocalDate fechaCreacion;
    private LocalTime horaEntrega;
    private LocalDate fechaEntrega;
    private String estadoEntrega;
    private Persona solicitante;
    private ArrayList<Plato> platosPedidos = new ArrayList<>();

    public Pedido(LocalDate fechaCreacion, LocalTime horaEntrega, LocalDate fechaEntrega, String estadoEntrega, Persona solicitante, ArrayList<Plato> platosPedidos) {
        this.fechaCreacion = fechaCreacion;
        this.horaEntrega = horaEntrega;
        this.fechaEntrega = fechaEntrega;
        this.estadoEntrega = estadoEntrega;
        this.solicitante = solicitante;
        this.platosPedidos = platosPedidos;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public ArrayList<Plato> getPlatosPedidos() {
        return platosPedidos;
    }

    public void setPlatosPedidos(ArrayList<Plato> platosPedidos) {
        this.platosPedidos = platosPedidos;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public void addPlato(Plato nuevoPlato) {
        platosPedidos.add(nuevoPlato);
    }

    public void removePlato(Plato platoARemover) {
        platosPedidos.remove(platoARemover);
    }

    public void modifyPlatos(Plato addPlato, Plato platoARemover) {
        addPlato(addPlato);
        removePlato(platoARemover);
    }


}


