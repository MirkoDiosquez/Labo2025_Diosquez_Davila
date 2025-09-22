int mesetaMasLarga (vector &v) {
    int i = 0;// 0(1)
    int maxMeseta =0;// O(1) 
    int meseta ;// O(1)
    while ( i < v.size () ) {// O(n)
    int j = i + 1; // O(2)
    while ( j < v.size () && v [ i ] == v [ j ]) {// O(n) + O(2)
    j ++;// O(1)
    }
    meseta = j - i ;// O(2) 
    i = j ;// O(1)
    if ( meseta > maxMeseta ) {// O(1)
    maxMeseta = meseta ;// O(1)
    }
    }
    return maxMeseta ; //O(1)
    }
    // O(3) + O(n) * (O(2)+ * O(n) + O(2)*(O(1)) = O(n)* O (n)= O(n^2) 

    int maxMeseta(vector &v){
        int maxMeseta=0;
        int meseta=null;
        for (int i = 0; i < v.size(); i++)
        {
            meseta=v[i];
            if (meseta>maxMeseta)
            {
                maxMeseta=meseta;
            }
            
        }
        return maxMeseta;
    
    }