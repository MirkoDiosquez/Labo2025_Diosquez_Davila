package Pedidos;

import Unidad_1.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Pedido> pedidos= new ArrayList<>();
    ArrayList<Plato> platos= new ArrayList<>();
    public Sistema(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }


    public ArrayList<Plato> platoDiaHoy() {
        ArrayList<Plato> platosHoy = new ArrayList<>();
        double totalPlato =0;
        for (Pedido p : pedidos) {
            for (Plato plato : p.getPlatosPedidos()) {
                if (p.getFechaEntrega() == LocalDate.now()) {
                    if (p.getSolicitante().getClass().equals("Profesor")) {
                        totalPlato= (plato.getPrecio() - (((Profesor) p.getSolicitante()).getPorcentajeDescuento() * plato.getPrecio()));
                        plato.setPrecio(totalPlato);
                        platosHoy.add(plato);
                    }
                }
            }
            totalPlato=0;
        }
        return platosHoy;
    }
    public int cantPlatos(Plato platoPedido){
        ArrayList<Plato> platosPedidos = new ArrayList<>();
        for (Pedido pedido:pedidos){
            platosPedidos.addAll(pedido.getPlatosPedidos());
        }
        int contador=0;
        for (Plato p: platos){
            if (p.getNombre().equals(platoPedido.getNombre())){
                contador++;
            }

        }

        return contador;

    }
    public void platosMasPedidos(){
        Plato p1= new Plato();
        Plato p2= new Plato();
        Plato p3= new Plato();
        for (Plato p: platos){
            if (cantPlatos(p)>cantPlatos(p1)){
                p3=p2;
                p2=p1;
                p1=p;
            }
            else if (cantPlatos(p)> cantPlatos(p2)){
                p3=p2;
                p2=p;
            }
            else if (cantPlatos(p)>cantPlatos(p3)){
                p3=p;
            }
            System.out.println("Plato n1" + p1.getNombre());
            System.out.println("Plato n2" + p2.getNombre());
            System.out.println("Plato n3" + p3.getNombre());
        }

    }


}
