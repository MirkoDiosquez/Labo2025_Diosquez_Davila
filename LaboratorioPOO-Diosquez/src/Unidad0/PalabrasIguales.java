import java.util.Scanner;

public class PalabrasIguales
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in) ;
        String pal1 = "" ;
        String pal2 = "" ;
        System.out.println("Ingrese una palabra") ;
        pal1 = entrada.nextLine() ;
        System.out.println("Ingrese una palabra") ;
        pal2 = entrada.nextLine() ;
        if (pal1.equals(pal2))
        {
            System.out.println("Las palabras son iguales") ;
        }
        else
        {
            System.out.println("Las palabras son desiguales") ;
        }
    }
}
