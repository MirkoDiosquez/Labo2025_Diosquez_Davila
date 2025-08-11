package Poblacion;

import java.util.HashSet;

public class Estado extends Lugar{
    private HashSet<Ciudad> ciudades = new HashSet<>();
    private static String nombre= TipoLugar.ESTADO.name();
}
