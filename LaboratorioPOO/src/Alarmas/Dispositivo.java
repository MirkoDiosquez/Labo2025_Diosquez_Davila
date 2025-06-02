package Alarmas;

import java.time.LocalDate;

public class Dispositivo {
    private boolean estado;
    private double medida;
    private double umbralInicial;
    private LocalDate añoAdquisicion;

    public Dispositivo(boolean estado, double medida, double umbralInicial, LocalDate añoAdquisicion) {
        this.estado = estado;
        this.medida = medida;
        this.umbralInicial = umbralInicial;
        this.añoAdquisicion = añoAdquisicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public double getUmbralInicial() {
        return umbralInicial;
    }

    public void setUmbralInicial(double umbralInicial) {
        this.umbralInicial = umbralInicial;
    }

    public LocalDate getAñoAdquisicion() {
        return añoAdquisicion;
    }

    public void setAñoAdquisicion(LocalDate añoAdquisicion) {
        this.añoAdquisicion = añoAdquisicion;
    }
    public String alarma(){
        return null;
    }
}
