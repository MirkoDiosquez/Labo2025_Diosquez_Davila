int sumarPotenciaHasta (int n) {
    int res = 0;// O(1)
    int i = 1; // O(1)
    while( i < n ) {// O(log n) = 2^i < n = i < log en base 2 de n  
        res = res + i; //O (1)
        i = i * 2;//O (1)
    }
    return res;//O (1)
    }
    // log n
    //¿Qué tiempo de ejecución de peor caso tiene el programa en función del valor n?