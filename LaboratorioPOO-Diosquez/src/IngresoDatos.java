import java.util.Scanner;

public class IngresoDatos
{
    public static void main(String[] args)
    {
            Scanner entrada = new Scanner(System.in) ;
        int n = 2 ;
        double a = 2.5 ;
        char c = 'C' ;
        System.out.println("El valor de N es : " +n );
        System.out.println("El valor de A es : " +a );
        System.out.println("El valor de C es : " +c );
        System.out.println("El valor de N + A es : " +(n+a) );
        System.out.println("El valor de N + A es : " +(a-n) );
        int cint =  (int)c ;
        System.out.println("El valor númerico de C es : " +cint );
    }
}


