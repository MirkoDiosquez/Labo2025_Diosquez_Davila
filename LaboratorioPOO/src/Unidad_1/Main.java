package Unidad_1;

public class Main {
    public static void main(String[] args) {
        ClaseCirculo circulo = new ClaseCirculo();
        ClaseRectangulo rectangulo = new ClaseRectangulo(2,5);
        System.out.println("El area del cuadrado es "+ circulo.obtenerArea(circulo.getRadio()));
        System.out.println("El Perimetro del cuadrado es "+ circulo.obtenerPerimetro(circulo.getRadio()));
        System.out.println("El area del rectangulo es "+ rectangulo.obtenerArea(rectangulo.getAltura(), rectangulo.getBase()));
        System.out.println("El Perimetro del rectangulo es "+ rectangulo.obtenerPerimetro(rectangulo.getAltura(), rectangulo.getBase()));
    }
}
