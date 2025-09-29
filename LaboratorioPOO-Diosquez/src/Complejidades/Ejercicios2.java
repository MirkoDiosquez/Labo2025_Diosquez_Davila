/*package Complejidades;

public class Ejercicios2
{
    void f1 (vector &vec)
    {
        i = vec.size() / 2 ; // 3 operaciones = O(1)
        while ( i >= 0 ) // 1 operacion = O(1)
        {
            vec [ vec.size () / 2 - i ] = i ; // 5 operaciones = O(n)
            vec [ vec.size () / 2 + i ] = i ; // 5 operaciones = O(n)
            i -- ; // 1 operacion = O(1)
        }
        // Total = 10 n + 5
    }

    void f2 (vector &vec)
    {
        i = 0 ;
        while ( i < 10000 )
        {
            vec [ vec.size() / 2 - i ] = i ;
            vec [ vec.size() / 2 + i ] = i ;
            i ++ ;
        }
    }
}
*/