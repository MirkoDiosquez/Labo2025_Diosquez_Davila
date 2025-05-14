package Numeros;

import java.util.Scanner;

public class IngresoDatos {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int n=9;
        double A=2;
        char C='C';
        int numericValue1 = (int) C;
        System.out.println("El valor de la variable N es: "+n);
        System.out.println("El valor de la variable A es: "+A);
        System.out.println("El valor de la variable C es: "+C);
        System.out.println("El valor de  n+A es: " +n+A);
        System.out.println("El valor de A-N es: " + (A-n));
        System.out.println("El valor del caracter C es : "+numericValue1);

    }
}
