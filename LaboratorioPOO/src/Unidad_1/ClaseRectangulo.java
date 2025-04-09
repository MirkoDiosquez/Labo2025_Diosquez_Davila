package Unidad_1;

public class ClaseRectangulo {
    private double base;
    private double altura;

    public ClaseRectangulo(double base, double altura){
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
    public double obtenerArea(double base, double altura) {
        double area = base*altura;
        return area;
    }
    public double obtenerPerimetro(double base, double altura){
        double perimetro= (base+altura) * 2;
        return perimetro;
    }
}
