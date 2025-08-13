package Unidad6.CreativoSInLimites;
import java.util.HashSet;

public class Empresa
{
    private HashSet<Diseñador> diseñadores ;

    public Empresa(HashSet<Diseñador> diseñadores) {
        this.diseñadores = diseñadores;
    }

    public HashSet<Diseñador> getdiseñadores() {
        return diseñadores;
    }

    public void setdiseñadores(HashSet<Diseñador> diseñadores) {
        this.diseñadores = diseñadores;
    }


    public void cambiarSueldo ()
    {
        int aux = 0 ;
        for (Diseñador d : diseñadores)
        {
            aux = d.getSueldo() ;
            aux = aux + (d.getTipo().getValor() / 100) ;
            d.setSueldo(aux) ;
        }
        System.out.println("El sueldo final es $" +aux);
    }

    public void cantiPoryectos (int DNI)
    {
        for(Diseñador d : diseñadores)
        {
            if(d.getDni() == DNI)
            {
              int aux =  d.getProyectos().size() ;
                System.out.println("El diseñador " +d.getNombre() +" tiene: " +aux +" proyectos");
            }
        }
    }

    public void origySueldo ()
    {
        int aux = 0 ;
        for (Diseñador d : diseñadores)
        {
            aux = d.getSueldo() ;
            aux = aux - (d.getTipo().getValor() / 100) ;
        }
        System.out.println("El sueldo sin comision es $" +aux );
    }


}

