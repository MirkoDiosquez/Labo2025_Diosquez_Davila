package PagoEmpleado;

public class Proyecto {
    private int numeroFabricacion;
    private double precio;
    private String nombre;

    public Proyecto(int numeroFabricacion, double precio, String nombre) {
        this.numeroFabricacion = numeroFabricacion;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getNumeroFabricacion() {
        return numeroFabricacion;
    }

    public void setNumeroFabricacion(int numeroFabricacion) {
        this.numeroFabricacion = numeroFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
