package Unidad6.SistemaPoblacion;
import java.util.HashSet;


public class Continente extends Lugar
{
    private HashSet<Pais> paises ;

    public Continente(String nombre, int id, HashSet<Pais> paises)
    {
        super(nombre, id);
        this.paises = paises;
    }

    public HashSet<Pais> getPaises()
    {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises)
    {
        this.paises = paises;
    }

    public int contador()
    {
        int aux = 0 ;
        for(Pais p : paises)
        {
            aux = aux + p.contador() ;
        }
        System.out.println("La cantidad de habitantes es de: ");
        return aux ;
    }
}
