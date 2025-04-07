import java.util.Scanner;

public class IntroducirNumeros2
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in) ;
        int auxi = 0 ;
        int contador = 0 ;
        int mayor = 0 ;
        int menor = 0 ;
        int posi = 0 ;System.out.println("Ingresó " +posi +" numeros positivos");
        int neg = 0 ;
        while( auxi != -1)
        {
            contador += 1;
            System.out.println("Ingrese valor del numero, inserte -1 si quieres finalizar");
            auxi = entrada.nextInt();
            if (auxi > 0) {
                posi += 1;
            } else if (auxi < 0) {
                neg += 1;
            }
            if (auxi > mayor) {
                mayor = auxi;
            } else if (auxi < menor) {
                menor = auxi;
            }
        }

        System.out.println("Ingresó " +contador +" numeros") ;
        System.out.println("Ingresó " +posi +" numeros positivos") ;
        System.out.println("Ingresó " +neg +" numeros negativos") ;
        System.out.println("El mayor número ingresado es " +mayor) ;
        System.out.println("El menor número ingresado es " +menor) ;

    }
}
