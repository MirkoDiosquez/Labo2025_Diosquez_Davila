package Poblacion;

import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais> paises = new HashSet<>();
    private static  String tipo = TipoLugar.CONTINENTE.name();
}
