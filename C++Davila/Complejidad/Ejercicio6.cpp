//Dada una secuencia de n números enteros, dar un programa que encuentre la
//máxima cantidad de elementos impares consecutivos cuya tiempo de ejecución de
//peor caso pertenezca a O(n).

#include <iostream>
#include <vector>
using namespace std ;

int maxImpares(vector &v){
    int maxImpares=0;
    int impares=0;
    int i = 0;
    while ( i < v.size () ) {
        if ( v [ i ] % 3 == 0 )
        {
            int j = i + 1;
            while ( j < v.size () && v [ i ] == v [ j ]) {
                j ++;
            }
         impares = j - i ;   
        i = j ;
        if ( impares > maxImpares ) {
            maxImpares = impares ;
            }
        }
    }
    return maxImpares ;
}