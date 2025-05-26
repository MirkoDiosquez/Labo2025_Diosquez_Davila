package Unidad3.SistemaAlmuerzo;

public class Plato
{
    private String nombre ;
    private double precio ;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void main(String[] args)
    {
        Plato pla1 = new Plato("Hamburguesa",75) ;
        Plato pla2 = new Plato("Pizza",100) ;
    }
}
