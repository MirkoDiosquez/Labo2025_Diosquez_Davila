package Unidad_1;

public class ClaseCirculo {
    private double radio;

    public ClaseCirculo() {
        this.radio=2;
    }
    public ClaseCirculo(double radio){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    public double obtenerArea(double radio) {
        double area = Math.PI * (radio * radio);
    return area;
    }
    public double obtenerPerimetro(double radio){
        double perimetro= radio * Math.PI * 2;
        return perimetro;
    }

}


