package Unidad6.SistemaPoblacion;

import java.util.HashSet;

public class Pais extends Lugar
{
    private HashSet<Provincia> provincias ;

    public Pais(String nombre, int id, HashSet<Provincia> provincias) {
        super(nombre, id);
        this.provincias = provincias;
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    public int contador()
    {
        int aux = 0 ;
        for(Provincia p : provincias)
        {
            aux = aux + p.contador() ;
        }
        System.out.println("La cantidad de habitantes es de: ");
        return aux ;
    }
}
