package Poblacion;

import java.util.HashSet;

public class Mundo extends Lugar{
    private HashSet<Continente> continentes = new HashSet<>();
    private static  String tipo = TipoLugar.MUNDO.name();
}
