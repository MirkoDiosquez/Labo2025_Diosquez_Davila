package ControlAlturaPeso;

import java.time.LocalDate;

public class Registro {
    private double peso;
    private double altura;
    private LocalDate fechaMedicion;

    public Registro(double peso, double altura, LocalDate fechaMedicion) {
        this.peso = peso;
        this.altura = altura;
        this.fechaMedicion = fechaMedicion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public LocalDate getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(LocalDate fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }
}
