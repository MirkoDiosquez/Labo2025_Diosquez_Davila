#include <iostream>
#include <vector>
using namespace std ;
vector<int> v ;
int ultimo1 (vector v) {
    return v[ v.size() - 1 ];
   }
   int ultimo2 (vector v) {
   int i = v.size();
   return v[ i - 1 ];
   }
   int ultimo3 (vector v) {
   int i = 0;
   while ( i < v.size() ) {
   i ++;
   }
   return v[ i - 1 ];
   }
// a)contiene 4 operaciones elementales
// b) contiene 5 operaciones elementales
// c) contiene 7 operaciones elementales
