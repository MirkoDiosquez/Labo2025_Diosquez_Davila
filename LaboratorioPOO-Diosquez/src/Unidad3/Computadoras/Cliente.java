package Unidad3.Computadoras;

import Unidad3.SistemaAlmuerzo.PersonaColegio;

public class Cliente extends PersonaColegio
{
    private int celular ;
    private String metodoPago ;
    private int numeroTarjeta ;


    public Cliente(String nombre, String apellido ,int celular, String metodoPago, int numeroTarjeta) {
        super(nombre, apellido);
        this.celular = celular;
        this.metodoPago = metodoPago;
        this.numeroTarjeta = numeroTarjeta;
    }

    // ----------------
    public int getCelular() {
        return celular;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    // ----------------
    public String getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    // ----------------
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }



}
