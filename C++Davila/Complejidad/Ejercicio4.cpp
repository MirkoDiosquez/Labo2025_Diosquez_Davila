vector hacerAlgo (vector &v) {
    vector res ;
    for (int i = 0; i < 100; i ++) {// O(100)
        res.push_back ( contarApariciones (v , i +1) );// O(n)
    }
    return res ;// O (1)
    }// O (100) * O(n) + O(1) = O(n)
    int contarApariciones (vector &v , int elem ) {
        int cantAp = 0;
        for (int i = 0; i < v . size (); i ++) {
            if ( v [ i ] == elem ) {
             cantAp ++;
            }   
        }
        return cantAp ;
    }
    //Calcular el tiempo de ejecución de peor caso del programa hacerAlgo con
    //respecto al largo de v.