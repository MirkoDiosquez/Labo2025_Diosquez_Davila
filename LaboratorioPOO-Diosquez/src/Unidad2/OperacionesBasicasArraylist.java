package Unidad2;

import Unidad1.Persona;

import java.util.ArrayList;

public class OperacionesBasicasArraylist
{
    public static void main(String[] args)
    {
        int aux = 0 ;
        ArrayList<Integer> numeros = new ArrayList<Integer>() ;
        numeros.add(2) ;
        numeros.add(3) ;
        numeros.add(4) ;
        for (int numero : numeros)
        {
            aux += numero ;
        }
        System.out.println("La suma de los numeros es: " +aux );
        System.out.println("-------------------------------");

        ArrayList<String> palabras = new ArrayList<String>() ;
        palabras.add("mirko");
        palabras.add("maxi");
        palabras.add("tiago");
        palabras.add("benja");
        System.out.println("Las palabras que arrancan con la letra m son: ");
        for (String palabra : palabras)
        {
            if ( palabra.charAt(0) == 'm')
            {
                System.out.println(palabra);
            }
        }
        System.out.println("-------------------------------");

        ArrayList<Persona> personas = new ArrayList<Persona>() ;
        personas.add(new Persona("Tiago",31,"Condarco 5584")) ;
        personas.add(new Persona("Mirko",33,"Kakita 2222")) ;
        personas.add(new Persona("Teo",30,"patito 2875")) ;
        System.out.println("Las personas con mas de 30 años son: ");
        for (Persona personita : personas)
        {
            if (personita.getEdad() > 30 )
            {
                System.out.println(personita.getNombre());
            }
        }
    }
}
