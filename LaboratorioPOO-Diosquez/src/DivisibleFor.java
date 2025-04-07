import java.util.Scanner;

public class DivisibleFor
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in) ;
        for (int i = 0 ; i <= 100 ; i ++)
        {
            if ( i % 2 == 0 || i % 3 == 0 )
            {
                System.out.println(i);
            }
        }
    }
}
