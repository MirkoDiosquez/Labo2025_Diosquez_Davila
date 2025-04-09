import java.util.Scanner;

public class NumeroMayor
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in) ;
        int M = 0 ;
        int N = 0 ;
        System.out.println("Elige el valor del primer numero (M)" );
        M = entrada.nextInt() ;
        System.out.println("Elige el valor del primer numero (N)" );
        N = entrada.nextInt() ;
        if ( M > N )
        {
            System.out.println("El mayor es M: " +M );
        }
        else if ( N > M )
        {
            System.out.println("El mayor es N: " +N );
        }
        else
        {
            System.out.println("Los números son iguales" );
        }
    }
}