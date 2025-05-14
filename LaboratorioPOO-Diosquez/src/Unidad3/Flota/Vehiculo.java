package Unidad3.Flota;

public class Vehiculo
{
    private String marca ;
    private String modelo ;
    private String color ;
    private int ruedas ;
    private int anio ;

    public Vehiculo(String marca, int anio, int ruedas, String color, String modelo)
    {
        this.marca = marca;
        this.anio = anio;
        this.ruedas = ruedas;
        this.color = color;
        this.modelo = modelo;
    }

    // Getters
    public String getMarca()
    {
        return marca;
    }
    public String getModelo()
    {
        return modelo;
    }
    public String getColor()
    {
        return color;
    }
    public int getRuedas()
    {
        return ruedas;
    }
    public int getAnio()
    {
        return anio;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }


}
