package ProductosElectronicos;

public class Multimedia extends Producto{
    private boolean bluetooth;
    static String categoria = Categoria.MULTIMEDIA.name();
    public Multimedia(String nombre, int stock, double precio, boolean bluetooth) {
        super(nombre, stock, precio);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
