package RepasoEvaluacionOctubre;

public class Experto extends Participante implements Entrada,Principal
{
    private static int tiempo = 80 ;

    public Experto(String direccion, String nombre, String apellido, int edad, Color colorEquipo) {
        super(direccion, nombre, apellido, edad, colorEquipo);
    }

    public static int getTiempo() {
        return tiempo;
    }

    public static void setTiempo(int tiempo) {
        Experto.tiempo = tiempo;
    }

    @Override
    public void comprobacion()
    {
        tiempo = tiempo - 5 ;
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es:" +tiempo);
    }
}
