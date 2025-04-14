package Unidad_1;

public class Coche {
    private String modelo;
    private String marca;
    private String color;
    private double velocidad;
    public Coche(String modelo, String marca, String color, double velocidad){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.velocidad=velocidad;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void  acelerar(double velocidad){
        this.velocidad=velocidad+20;

    }
    public void  frenar(){
        this.velocidad=0;

    }
    public double  mostrarVelocidadACT(){
        return this.velocidad;
    }
}
