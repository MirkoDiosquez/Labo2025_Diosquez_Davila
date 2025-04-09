package Unidad_1;

public class ClaseCoche {
    private String modelo;
    private String marca;
    private String color;
    public ClaseCoche(String modelo, String marca, String color ){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
