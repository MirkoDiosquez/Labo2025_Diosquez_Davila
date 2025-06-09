package ProductosElectronicos;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public void addProducto(Producto nuevoProducto){
        productos.add(nuevoProducto);

    }
    public void removeProducto(Producto removedProducto){
        productos.remove(removedProducto);
    }
    public void modifyProducto(Producto nuevoProducto, Producto removedProducto){
        removeProducto(removedProducto);
        addProducto(nuevoProducto);
    }
    public Producto mayorStock(){
        Producto mayStock= new Producto();
        for (Producto p:productos){
            if (p.getStock()> mayorStock().getStock())mayStock=p;
        }
        return mayStock;
    }
    public Producto menorStock(){
        Producto menStock= new Producto();
        for (Producto p:productos){
            if (p.getStock()< mayorStock().getStock())menStock=p;
        }
        return menStock;
    }
}
