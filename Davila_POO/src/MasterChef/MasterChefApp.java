package MasterChef;

import DireccionClase.Direccion;

import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args) {
        // Ingredientes
        Ingrediente tomate = new Ingrediente("Tomate",2);
        Ingrediente papa = new Ingrediente("Papa",4);
        Ingrediente cebolla = new Ingrediente("Cebolla",5);
        Ingrediente carne = new Ingrediente("Carne",6);

        // HashSet de ingredientes prohibidos
        HashSet<Ingrediente> prohibidosPrincipiante = new HashSet<>();
        HashMap<Ingrediente, Integer> stockIntermedio = new HashMap<>();
        prohibidosPrincipiante.add(cebolla);
        prohibidosPrincipiante.add(papa);
        stockIntermedio.put(cebolla, 2);
        stockIntermedio.put(papa, 512);

        Principiante p1 = new Principiante("Toto", 3, new Direccion("alvaro", 3), "frac", prohibidosPrincipiante );

        Intermedios p2 = new Intermedios(stockIntermedio);
        Expertos p3 = new Expertos();

        // Mostrar mensajes
        System.out.println("--- Mensajes de los participantes ---");
        System.out.println("Principiante: " + p1.mostrarMensaje());
        System.out.println("Intermedio: " + p2.mostrarMensaje());
        System.out.println("Experto: " + p3.mostrarMensaje());


    }
}
