    package Numeros;

    import java.util.Scanner;

    public class IntroducirNumeros {
        public static void main(String[] args) {
            Scanner e = new Scanner(System.in);
            int numero=1;
            int contador=0;
            while(numero!= -1)
            {
                System.out.println("Dime un numero");
                numero=e.nextInt();
                contador++;
            }
            System.out.println("La cantidad de numeros ingresados es " + contador);
        }
    }
