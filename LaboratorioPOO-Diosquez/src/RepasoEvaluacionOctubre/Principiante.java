package RepasoEvaluacionOctubre;
import java.util.HashSet;

public class Principiante extends Participante implements Entrada{
    private HashSet<String> ingrdientesProhibidos ;

    public Principiante(String direccion, String nombre, String apellido, int edad, Color colorEquipo, HashSet<String> ingrdientesProhibidos) {
        super(direccion, nombre, apellido, edad, colorEquipo);
        this.ingrdientesProhibidos = ingrdientesProhibidos;
    }

    public HashSet<String> getIngrdientesProhibidos() {
        return ingrdientesProhibidos;
    }

    public void setIngrdientesProhibidos(HashSet<String> ingrdientesProhibidos) {
        this.ingrdientesProhibidos = ingrdientesProhibidos;
    }

    @Override
    public void comprobacion()
    {
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar: ") ;
        for(String s : ingrdientesProhibidos)
        {
            System.out.println(s);
        }
    }

}