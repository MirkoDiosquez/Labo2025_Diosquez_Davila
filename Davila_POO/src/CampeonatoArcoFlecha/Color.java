package CampeonatoArcoFlecha;

public enum Color {
    ROJO(4),VERDE(3),AMARRILLO(5),BLANCO(1),NEGRO(2);

    private int puntos;

    private Color(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;


    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
