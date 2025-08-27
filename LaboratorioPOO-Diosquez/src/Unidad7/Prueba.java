package Unidad7;

public class Prueba
{
    public static void main(String[] args)
    {
        try
        {
            String nombre = null;
            System.out.println("El largo del nombre es:" + nombre.length());
        }
        catch(NullPointerException e)
        {
            System.err.println("Te equivocaste");
            System.err.println("Att: Mirko Diosquez");
        }

        String nombre = null;
        try
        {
          if(nombre == null)
          {
              System.err.println("No puede haber un nombre vacio");
              throw new NullPointerException("No puede haber un nombre vacio");
          }
          System.out.println("El largo del nombre es:" + nombre.length());

        }
        catch(NullPointerException e)
        {
            System.err.println("Te equivocaste");
            System.err.println("Att: Mirko Diosquez");
        }
    }
}

