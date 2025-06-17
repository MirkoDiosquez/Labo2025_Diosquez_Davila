package ProductosElectronicos;

public class CargadorPortatil extends Producto {
    private int cantidadMaximaCarga;
    public static categoria = Categoria.CARGADOR.name();


    public CargadorPortatil(String nombre, int stock, double precio, int cantidadMaximaCarga) {
        super(nombre, stock, precio);
        this.cantidadMaximaCarga = cantidadMaximaCarga;
    }

    public int getCantidadMaximaCarga() {
        return cantidadMaximaCarga;
    }

    public void setCantidadMaximaCarga(int cantidadMaximaCarga) {
        this.cantidadMaximaCarga = cantidadMaximaCarga;
    }
}
