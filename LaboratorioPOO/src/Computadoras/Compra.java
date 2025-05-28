package Computadoras;

import Unidad_1.Persona;

import java.util.ArrayList;

public class Compra {
    Cliente comprador;
    private boolean efectivo;
    private boolean tarjeta;
    private ArrayList<Componente> componentes= new ArrayList<>();



    public Compra(Cliente comprador, boolean efectivo, boolean tarjeta, ArrayList<Componente> componentes, double precioTotal) {
        this.comprador = comprador;
        this.efectivo = efectivo;
        this.tarjeta = tarjeta;
        this.componentes = componentes;

    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public boolean isEfectivo() {
        return efectivo;
    }

    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }

    public boolean isTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public double calcularPrecio(){
        double precioTotal=0;
        for (Componente c: componentes){
            precioTotal+=c.getPrecio();
        }
        return precioTotal;
    }

}
