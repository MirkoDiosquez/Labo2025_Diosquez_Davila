package CampeonatoArcoFlecha;

import java.util.HashMap;

public class DianaCircular extends Diana{
    private static int radio = 13;

    public DianaCircular(String nombre, Nivel dificultad, HashMap<Integer, Color> puntajes) {
        super(nombre, dificultad, puntajes);
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int radio) {
        DianaCircular.radio = radio;
    }
}
