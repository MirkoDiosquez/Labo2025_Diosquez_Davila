package Unidad1;

import java.util.Scanner;

public class Persona
{
    private String nombre ;
    private String direccion;
    private int edad ;

    // Constreuctor por parametro
    public Persona(String nombre,int edad,String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    // Getters
    public int getEdad()
    {
       return edad;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getDireccion()
    {
        return direccion;
    }

    //Metodos
    public void imprimir ()
    {
        System.out.println("La persona se llama: " +nombre);
        System.out.println("La direccion de la persona es: " +direccion);
        System.out.println("La edad de la persona es: " +edad +" años");
    }

    public static void main(String[] args)
    {
        Scanner entrada = new  Scanner(System.in) ;
        String nom = "" ;
        String dire = "" ;
        int edi = 0 ;
        System.out.println("Introduce el nombre de la persona");
        nom = entrada.next() ;
        System.out.println("Introduce la direccion de la persona");
        dire = entrada.next() ;
        System.out.println("Introduce la edad de la persona");
        edi = entrada.nextInt() ;
        Persona p1 = new Persona(nom,edi,dire) ;
        p1.imprimir() ;
    }
}
