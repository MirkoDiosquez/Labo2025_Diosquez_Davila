package Figuras;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
this.base= base;
this.altura = altura;
}
public double getBase(){
    return base;
}
public double getAltura() {
   return altura;
}
public void setAltura(double altura){
    this.altura= altura;
}
public void setBase(double Base){
     this.base= base;
}
    public double obtenerArea() {
        double area = base*altura;
        return area;
    }
    public double obtenerPerimetro(){
        double perimetro= (base+altura) * 2;
        return perimetro;
    }
}
