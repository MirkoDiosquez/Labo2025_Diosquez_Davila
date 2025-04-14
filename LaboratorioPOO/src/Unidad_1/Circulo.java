package Unidad_1;

public class Circulo {
    private double radio;

    public Circulo() {
        this.radio=2;
    }
    public Circulo(double radio){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    public double obtenerArea() {
        double area = Math.PI * (radio * radio);
    return area;
    }
    public double obtenerPerimetro(){
        double perimetro= radio * Math.PI * 2;
        return perimetro;
    }

}


