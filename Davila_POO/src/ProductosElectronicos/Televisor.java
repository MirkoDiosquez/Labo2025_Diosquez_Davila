package ProductosElectronicos;

public class Televisor extends Multimedia{
    private Tecnologia resolucion;

    public Televisor(String nombre, int stock, double precio, boolean bluetooth, Tecnologia resolucion) {
        super(nombre, stock, precio, bluetooth);
        this.resolucion = resolucion;
    }

    public Tecnologia getResolucion() {
        return resolucion;
    }

    public void setResolucion(Tecnologia resolucion) {
        this.resolucion = resolucion;
    }
}
