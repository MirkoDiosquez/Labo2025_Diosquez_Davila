package Tickets;

import Unidad_1.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Desarrollador extends Persona {
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Desarrollador(String nombre, int edad, String direccion, ArrayList<Ticket> tickets) {
        super(nombre, edad, direccion);
        this.tickets = tickets;
    }

    public String agregarComentario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el comentario");
        String comentario = sc.nextLine();
        return comentario;

    }
    public int cantResueltos(){
        int cant=0;
        for (Ticket t: tickets){
            if (t.getEstado().equals(Estado.RESUELTO))cant++;
        }
        return cant;
    }
}
