package Vehiculos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int cantRuedas;
    private LocalDate fechaFabricacion;
    private ArrayList<VehiculoMotorizado> vehiculoMotorizados = new ArrayList<>();
    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();
    public Vehiculo(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.fechaFabricacion = fechaFabricacion;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public ArrayList<VehiculoMotorizado> getVehiculoMotorizados() {
        return vehiculoMotorizados;
    }

    public void setVehiculoMotorizados(ArrayList<VehiculoMotorizado> vehiculoMotorizados) {
        this.vehiculoMotorizados = vehiculoMotorizados;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }


    public int cantBici(){
        int cantBicis= bicicletas.size();
        return cantBicis;
    }

}

