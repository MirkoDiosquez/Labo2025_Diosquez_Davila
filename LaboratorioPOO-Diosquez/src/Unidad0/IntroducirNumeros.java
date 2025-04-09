import java.util.Scanner;

public class IntroducirNumeros
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in) ;
        int auxi = 0 ;
        int contador = 0 ;
        while( auxi != -1)
        {
            contador += 1 ;
            System.out.println("Ingrese valor del numero, inerte -1 si quieres finalizar");
            auxi = entrada.nextInt() ;
        }
        System.out.println("Ingresó " +contador +" numeros");
    }
}
