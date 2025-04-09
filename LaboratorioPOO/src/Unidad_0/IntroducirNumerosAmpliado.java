package carpetaJavaDavila;

import java.util.Scanner;

public class IntroducirNumerosAmpliado {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int numero=0;
        int contador=0;
        int total=0;
        int mayNumero=0;
        int menNumero=0;
        int numPositivo=0;
        int numNegativo=0;
        while(numero!= -1)
        {
            System.out.println("Dime un numero");
            numero=e.nextInt();
            if (mayNumero<numero){
                mayNumero=numero;
            }
            if (menNumero>numero)
            {
                menNumero=numero;
            }
            if (numero>0){
                numPositivo+=numero;
            }
            if (numero<0)
            {
                numNegativo+=numero;
            }

            contador++;
            total += numero;

        }
        System.out.println("La cantidad de numeros ingresados es " + contador);
        System.out.println("El mayor numero ingresado es " + mayNumero);
        System.out.println("El menor numero ingresado es " + menNumero);
        System.out.println("La suma de todos los numeros ingresados es " + total);
        System.out.println("La suma de todos los numeros negativos ingresados es " + numNegativo);
        System.out.println("La suma de todos los numeros positivos ingresados es " + numPositivo);
    }
}
