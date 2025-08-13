package Unidad6.SistemaPoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Provincia extends Lugar {
    private HashSet<Ciudad> ciudades;

    public Provincia(String nombre, int id, HashSet<Ciudad> ciudades) {
        super(nombre, id);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public int contador()
    {
        int aux = 0 ;
        for(Ciudad c : ciudades)
        {
            aux = aux + c.contador() ;
        }
        System.out.println("La cantidad de habitantes es de: ");
        return aux ;
    }
}
