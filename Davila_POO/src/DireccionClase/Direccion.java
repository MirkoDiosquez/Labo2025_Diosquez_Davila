package DireccionClase;

public class Direccion {
    private String direccion;
    private int altura;

    public Direccion(String direccion, int altura) {
        this.direccion = direccion;
        this.altura = altura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
