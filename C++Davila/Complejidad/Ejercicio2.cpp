/* 
Calcular el tiempo de ejecución de peor caso (en notación O grande) de los
siguientes programas con respecto al tamaño de los secuencias de entrada.
Recordar que tanto la lectura como la escritura de un elemento en un vector
tiene tiempo de ejecución perteneciente a O(1).
*/
#include <iostream>
#include <vector>
using namespace std ;
vector <int> vec ;

int i ;
void f1 (vector &vec) {
    i = vec.size() / 2; // O(1)
    while ( i >= 0 ){// O(n/2)* O(1)
    vec [ vec.size () / 2 - i ] = i;
    vec [ vec.size () / 2 + i ] = i;
    i - -;
    }
    }
    void f2 (vector &vec) {
        i = 0;// O(1)
        while ( i < 10000){// O(1)
        vec [ vec.size() / 2 - i ] = i ;
        vec [ vec.size() / 2 + i ] = i ;
        i ++;
        }//O(n)
        }