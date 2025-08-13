package Unidad6.SistemaPoblacion;
import java.util.HashMap;
import java.util.HashSet;

public class Ciudad extends Lugar
{
    private HashSet<Barrio> barrios ;

    public Ciudad(String nombre, int id, HashSet<Barrio> barrios) {
        super(nombre, id);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    public int contador()
    {
        int aux = 0 ;
        for(Barrio b : barrios)
        {
            aux = aux + b.contador() ;
        }
        System.out.println("La cantidad de habitantes es de: ");
        return aux ;
    }

}
