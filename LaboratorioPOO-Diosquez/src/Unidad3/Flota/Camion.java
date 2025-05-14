package Unidad3.Flota;

public class Camion extends Automotores
{
    private int carga;

    public Camion(String marca, int anio, int ruedas, String color, String modelo, String patente, int carga)
    {
        super(marca, anio, ruedas, color, modelo, patente);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
