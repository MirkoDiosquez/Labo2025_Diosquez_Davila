package Computadoras;

import java.util.ArrayList;

public class SitioWeb {
    private ArrayList<Componente> computadorasVendidas=new ArrayList<>();

    public SitioWeb(ArrayList<Componente> computadorasVendidas) {
        this.computadorasVendidas = computadorasVendidas;
    }

    public ArrayList<Componente> getComputadorasVendidas() {
        return computadorasVendidas;
    }

    public void setComputadorasVendidas(ArrayList<Componente> computadorasVendidas) {
        this.computadorasVendidas = computadorasVendidas;
    }

    public void agregarActualizar(Compra compraHecha){
        int stock=0;
        for (Componente c: compraHecha.getComponentes()){
            if (c instanceof CPU){
                computadorasVendidas.add(c);
                stock=c.getStock();
                stock--;
            }
            c.setStock(stock);
        }
    }
    public int cantidadPerifericos(Compra compraHecha){
        int cantidad=0;
        for (Componente c: compraHecha.getComponentes()){
            if (c instanceof DispositivoEntrada)cantidad++;
            else if (c instanceof  DispositivoSalida)cantidad++;
        }
        return cantidad;
    }

    public static void main(String[] args) {

    }
}
