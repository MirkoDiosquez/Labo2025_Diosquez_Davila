package Vacunatorio;

import java.time.LocalDate;

public class Vacuna {
    private LocalDate fechaFabricacion;
    private LocalDate fechaAplicacion;
    private int lote;
    private int numeroFabricacion;
    private String nombreComercial;

    public Vacuna(LocalDate fechaFabricacion, LocalDate fechaAplicacion, int lote, int numeroFabricacion, String nombreComercial) {
        this.fechaFabricacion = fechaFabricacion;
        this.fechaAplicacion = fechaAplicacion;
        this.lote = lote;
        this.numeroFabricacion = numeroFabricacion;
        this.nombreComercial = nombreComercial;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getNumeroFabricacion() {
        return numeroFabricacion;
    }

    public void setNumeroFabricacion(int numeroFabricacion) {
        this.numeroFabricacion = numeroFabricacion;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
}
