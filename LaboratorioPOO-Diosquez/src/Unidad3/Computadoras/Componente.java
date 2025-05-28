package Unidad3.Computadoras;

public class Componente
{
    private String fabricante ;
    private String modelo ;
    private double precio ;
    private int stock ;

    public Componente(String fabricante, int stock, double precio, String modelo) {
        this.fabricante = fabricante;
        this.stock = stock;
        this.precio = precio;
        this.modelo = modelo;
    }

    // ----------------
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    // ----------------
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    // ----------------
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // ----------------
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
