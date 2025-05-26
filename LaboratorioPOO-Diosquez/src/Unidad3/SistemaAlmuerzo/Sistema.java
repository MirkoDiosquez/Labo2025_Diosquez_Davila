package Unidad3.SistemaAlmuerzo;

import Unidad1.Fecha;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema
{
    private ArrayList<Pedido> pedidos ;
    private ArrayList<Plato> auxi ;


    public Sistema(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPedido (Pedido pedido)
    {
        pedidos.add(pedido) ;
        System.out.println("Se ha agregado el pedido");
    }

    public void eliminarPedido (Pedido pedido)
    {
        pedidos.remove(pedido);
        System.out.println("El plato ha sido eliminado");

    }


    public void modificarPedido (Pedido pedidoM,  Pedido pedidoE )
    {
        pedidos.remove(pedidoE);
        pedidos.add(pedidoM);
    }

    public void lisaPlatitos(Fecha fechita)
    {
        for (Pedido pe : pedidos)
        {
            if (pe.getFechaCreacion() == LocalDate.now())
            {
                for (Plato pla : pe.getPlatos())
                {
                    auxi.add(pla);
                }
            }
        }
    }

    public static void main(String[] args)
    {

    }
}



