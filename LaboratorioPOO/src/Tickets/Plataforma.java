package Tickets;

import java.time.YearMonth;
import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private ArrayList<Desarrollador> desarrolladores = new ArrayList<>();
    private YearMonth fecha;
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public ArrayList<Desarrollador> getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(ArrayList<Desarrollador> desarrolladores) {
        this.desarrolladores = desarrolladores;
    }


    public int determinadoEstado(Estado e){
        int cantTickets=0;
        for (Ticket t: tickets){
            if (t.getEstado().equals(e))cantTickets++;
        }
        return cantTickets;
    }


    public int cantTicketsTotales(){
        return tickets.size();
    }
    public Ticket ticketMasAntiguo(){
        Ticket masAntiguoAbierto = new Ticket();
        for (Ticket t: tickets){
            if (masAntiguoAbierto.getHoraCreacion().isBefore(t.getHoraCreacion()) && t.getEstado().equals(Estado.ABIERTO))masAntiguoAbierto=t;
        }
        return masAntiguoAbierto;
    }
    public Desarrollador desarroladorMasTickets(){
        Desarrollador dsMayorResuelto = new Desarrollador();
        for (Desarrollador desarrollador: desarrolladores){
            if (dsMayorResuelto.cantResueltos()< desarrollador.cantResueltos())dsMayorResuelto= desarrollador;
        }
        return dsMayorResuelto;
    }
    public int cantTicketsAsignados(Desarrollador ds){
        int cantTickets=0;
        cantTickets= ds.getTickets().size();
        return  cantTickets;
    }
    public Desarrollador desarrolladorMasAntiguo(){
        Desarrollador des = new Desarrollador();
        for (Desarrollador ds: desarrolladores){
            if ()
        }
    }

    public ArrayList<Desarrollador> desarrolladorsAsignados(Ticket ticket){
        ArrayList<Desarrollador> desas = new ArrayList<>();
        for (Desarrollador desa: desarrolladores){
            for (Ticket tk: desa.getTickets()){
                if(tk.equals(ticket))desas.add(desa);
            }
        }
        return  desas;
    }
    public double promedio




}
