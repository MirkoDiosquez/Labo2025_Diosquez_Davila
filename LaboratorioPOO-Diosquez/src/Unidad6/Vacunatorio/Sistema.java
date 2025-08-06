package Unidad6.Vacunatorio;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema
{
    // private HashSet<Vacuna> vacunas ;
    private HashMap<Integer, Ciudadano> historial ;

    public void agregarVacuna(int auxd, Vacuna VAC)
    {
        if(historial.containsKey(auxd))
        {
            Ciudadano c = historial.get(auxd) ;
            c.getVacunas().add(VAC);
        }
    }

    public void historialVac (int auxd)
    {
        if(historial.containsKey(auxd))
        {
            Ciudadano c = historial.get(auxd);
            System.out.println( c.getVacunas() ) ;
        }
    }

    public void vacunaProv()
    {
        HashMap<Pronvincia, Integer> AuxP = new HashMap<>() ;

        for(Ciudadano c : historial.values())
        {
            if( AuxP.containsKey(c.getProvincia()) )
            {
                Pronvincia auxpro = c.getProvincia() ;
                int valor = AuxP.get(auxpro);
                int valorNuevo = valor + 1 ;
                AuxP.remove(auxpro);
                AuxP.put(auxpro,valorNuevo) ;
            }
            else
            {
                AuxP.put(c.getProvincia(), 1 ) ;
            }
        }
    }

    public static void main(String[] args)
    {

    }

}
