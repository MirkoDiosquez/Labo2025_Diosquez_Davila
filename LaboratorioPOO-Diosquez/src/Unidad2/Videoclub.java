package Unidad2;

import java.util.ArrayList;

public class Videoclub
{
    private String direccion ;
    private int codigoPostal ;
    private ArrayList<Estanteria> Estanterias ;


    public Videoclub ()
    {
        this.direccion = direccion ;
        this.codigoPostal = codigoPostal ;
        this.Estanterias = Estanterias ;
    }

    public String getDireccion ()
    {
        return this.direccion ;
    }

    public int getCodigoPostal()
    {
        return  this.codigoPostal ;
    }

    public ArrayList<Estanteria> getEstanterias()
    {
        return this.Estanterias ;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias)
    {
        Estanterias = estanterias;
    }

    public void setCodigoPostal(int codigoPostal)
    {
        this.codigoPostal = codigoPostal;
    }

    // ABM
    public void agregarEstanteria (Estanteria lal)
    {
        Estanterias.add(lal);
    }

    public void borarEstanteria (Estanteria borri)
    {
        for (Estanteria ono : Estanterias)
        {
            if ( ono.getCodigo() == borri.getCodigo() )
            {
                Estanterias.remove(ono) ;
            }
        }
    }

    public void modificarEstanteria(Estanteria modi, int codi)
    {
        for (Estanteria sos : Estanterias)
        {
            if (sos.getCodigo() == codi )
            {
                sos = modi ;
            }
        }
    }

    public void mayorDuracion()
    {
        Pelicula pMayor = new Pelicula() ;
        Estanteria eMayor = new Estanteria() ;
        for (Estanteria esta : Estanterias)
        {
            for (Pelicula pele : esta.getPeliculas())
            {
                if ( pele.getDuracion() > pMayor.getDuracion())
                {
                    pMayor = pele ;
                    eMayor = esta ;
                }
            }
        }
        System.out.println("-----------------------");
        System.out.println("La pelicula mas larga es: " +pMayor.getNombre());
        System.out.println("Pertenece a la estanteria " +eMayor.getCodigo());
    }

    public static void main(String[] args)
    {

    }

}


