package CampeonatoArcoFlecha;

import java.util.HashMap;

public class DianaCuadrada extends Diana{
    private int lado;

    public DianaCuadrada(String nombre, Nivel dificultad, HashMap<Integer, Color> puntajes, int lado) {
        super(nombre, dificultad, puntajes);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
