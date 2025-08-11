package Poblacion;

import java.util.HashSet;

public class Pais extends  Lugar{
    private HashSet<Estado> estados = new HashSet<>();
    private static  String tipo = TipoLugar.PAIS.name();

}
