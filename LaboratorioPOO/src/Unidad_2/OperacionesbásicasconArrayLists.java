package Unidad_2;
import Unidad_1.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesbásicasconArrayLists {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int total =0;
        System.out.println("Dime una letra");
        char letra = e.next().charAt(0);
        ArrayList <Integer> numeros = new ArrayList<Integer>();
        ArrayList <String> palabras = new ArrayList<String>();
        ArrayList <Persona> personas = new ArrayList<Persona>();

            numeros.add(3);
            numeros.add(2);
            numeros.add(7);
            numeros.add(5);
            palabras.add("Auto");
            palabras.add("Casa");
            palabras.add("Colegio");
            palabras.add("Mochila");
            personas.add(new Persona("Jose", 61, "Campana 2991"));
            personas.add(new Persona ("Manuel", 30, "Hempalador 4991"));
            for (Integer numero: numeros){

                 total+=numero;
            }
            for(String palabra: palabras){
                if (palabra.charAt(0)==letra){
                    System.out.println("La palabra que empieza por la letra " + letra +" es " + palabra);
                }
            }
            for (Persona persona: personas){
                if (persona.getEdad() > 30){
                    System.out.println("La persona mayor de 30 años es "+persona.getNombre());
                }
            }
        System.out.println("La suma de los numeros del ArrayList es "+ total);
    }

}
