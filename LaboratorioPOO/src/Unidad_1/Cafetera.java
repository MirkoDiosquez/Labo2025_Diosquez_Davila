package Unidad_1;

public class Cafetera {
    private int cantidadMaxima;
    private int cantidadActual;
    private int cantidad;

    public Cafetera (){
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
        this.cantidad = 50;
    }
    public Cafetera (int cantidad, int cantidadMaxima, int cantidadActual){
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadMaxima;
        this.cantidad = cantidad;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
    public void rellenarCafetera(){
        this.cantidadActual = this.cantidadMaxima;
    }
    public void servirTaza(int capacidad){
        if (this.cantidadActual >= capacidad) this.cantidadActual -= capacidad;
        System.out.println( "Servir taza de " + capacidad + " ml");
        System.out.println( "Cantidad actual: " + this.cantidadActual);

    }
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    public void agregarCafe(int cantidad){
        this.cantidadActual += cantidad;
    }

}
