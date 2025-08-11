package Poblacion;

import java.util.HashSet;

public class Ciudad  extends Lugar{
 private HashSet<Barrio> barrios = new HashSet<>();
 private static  String tipo = TipoLugar.CIUDAD.name();
}
