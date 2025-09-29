package RepasoEvaluacionOctubre;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Intermedio extends Participante implements Principal
{
    private HashMap<String,Integer> stockIngredientes ;

    public Intermedio(String direccion, String nombre, String apellido, int edad, Color colorEquipo, HashMap<String,Integer> stockIngredientes) {
        super(direccion, nombre, apellido, edad, colorEquipo);
        this.stockIngredientes = stockIngredientes;
    }

    public HashMap<String, Integer> getStockIngredientes() {
        return stockIngredientes;
    }

    public void setStockIngredientes(HashMap<String, Integer> stockIngredientes) {
        this.stockIngredientes = stockIngredientes;
    }

    @Override
    public void comprobacion()
    {
        HashSet<String> ingredientesMayorUno = new HashSet<>() ;
        for(Map.Entry<String, Integer> entry: stockIngredientes.entrySet())
        {
            if(entry.getValue() > 1)
            {
                ingredientesMayorUno.add(entry.getKey()) ;
            }
        }
        if(ingredientesMayorUno.isEmpty())
        {
            System.out.println("No hay ingredientes suficientes");
        }
        else
        {
            System.out.println("Mi stock a utilizar es de:") ;
            for (String s : ingredientesMayorUno)
            {
                System.out.println(s);
            }
        }
    }
}
