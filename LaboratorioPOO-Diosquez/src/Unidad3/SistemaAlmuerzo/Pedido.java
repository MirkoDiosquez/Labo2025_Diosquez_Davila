package Unidad3.SistemaAlmuerzo;

import Unidad1.Fecha;

import java.time.LocalDate ;
import java.util.ArrayList;

public class Pedido
{
    private LocalDate  fechaCreacion ;
    private ArrayList<Plato> platos ;
    private String horaEntrega ;
    private boolean estadoPedido ;
    private PersonaColegio personaPedido ;

    public Pedido(LocalDate fechaCreacion, ArrayList<Plato> platos, String horaEntrega, boolean estadoPedido, PersonaColegio personaPedido) {
        this.fechaCreacion = fechaCreacion;
        this.platos = platos;
        this.horaEntrega = horaEntrega;
        this.estadoPedido = estadoPedido;
        this.personaPedido = personaPedido;
    }

    public Pedido() {
        this.fechaCreacion = LocalDate.of(2025,5,24);
        this.platos = new ArrayList<>(); ;
        this.horaEntrega = "13:00";
        this.estadoPedido = false ;
        this.personaPedido = null ;
    }

    // Getters
    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public PersonaColegio getPersonaPedido() {
        return personaPedido;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public boolean isEstadoPedido() {
        return estadoPedido;
    }

    // Setters
    public void setPersonaPedido(PersonaColegio personaPedido) {
        this.personaPedido = personaPedido;
    }

    public void setEstadoPedido(boolean estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public void setPlatos(ArrayList<Plato> platoss) {
        this.platos = platoss;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    public void agregarPlato(Plato plato)
    {
        platos.add(plato) ;
        System.out.println("Se ha agregado el plato");
    }

    public void eliminarPlato (Plato plato)
    {
        platos.remove(plato);
        System.out.println("El plato ha sido eliminado");

    }

    public void modificarPlato (Plato platoM, Plato platoE)
    {
         platos.remove(platoE) ;
         platos.add(platoM);
    }

    public void aplicarDescuento (PersonaColegio pau)
    {
        if (pau instanceof Profesor)
        {
            Profesor profe = (Profesor) pau;
            for (Plato pla : platos)
            {
                double auxi = pla.getPrecio() - (pla.getPrecio() * profe.getDescuento() /100 ) ;
                pla.setPrecio(auxi);
            }
        }
    }


    public static void main(String[] args)
    {
        Pedido pe1 = new Pedido(LocalDate.now(), );
    }
}
